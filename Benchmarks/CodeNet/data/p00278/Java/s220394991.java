import java.io.*;
import java.util.*;

class Pair< T1 extends Comparable<T1>, T2 extends Comparable<T2> >
    implements Comparable< Pair<T1, T2> > {
    
    public T1 first;
    public T2 second;
 
    Pair ( T1 first, T2 second ) {
        this.first = first;
        this.second = second;
    }

    public int compareTo( Pair<T1,T2> o ) {
	int r = first.compareTo( o.first );
	return r == 0 ? second.compareTo( o.second ) : r;
    }
}

class Main {

    static final int INF = (int)1e9 + 1;

    int n, q;
    int[] s = null;
    int[] f = null;
    
    int LowerBound( int v ) {
	int l = 0, r = n;
	while ( r - l > 1 ) {
	    int mid = ( l + r )/2;
	    if ( s[mid] >= v ) r = mid;
	    else l = mid;
	}
	return v <= s[l] ? l : r;
    }

    int UpperBound( int v ) { return LowerBound(v+1); }

    void solve(){

	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	q = sc.nextInt();

	ArrayList< Pair<Integer,Integer> > tmp = new ArrayList< Pair<Integer,Integer> >();
	for ( int i=0; i<n; ++i ) {
	    tmp.add( new Pair<Integer,Integer>( sc.nextInt(), i ) );
	}
	Collections.sort( tmp );

	s = new int[n];
	f = new int[n];
	for ( int i=0; i<n; ++i ) {
	    s[i] = tmp.get(i).first;
	    f[tmp.get(i).second] = i;
	}

	TreeSet<Integer> leader = new TreeSet<Integer>();
	while ( q-- > 0 ) {

	    String op = sc.next();
	    int arg = sc.nextInt();

	    if      ( op.equals("ADD") ) leader.add( f[arg-1] );
	    else if ( op.equals("REMOVE") ) leader.remove( f[arg-1] );
	    else {

		int fail_r = -1, succ_r = INF;//条件を満たさない最大のr と 満たす最小のr

		while ( succ_r - fail_r > 1 ) {
		
		    int mid = (succ_r + fail_r)/2;//新しいr

		    int count = 0; //リーダーによってカバーされる生徒の総数
		    int prev = -1; //リーダーのうちスコアが一つ下の人のインデックス
		    for ( int idx : leader ) {

			//全スコア中でリーダーからr引いたスコアの人のインデクス
			int l_idx = LowerBound( s[idx] - mid );

			//全スコア中でリーダーのスコアのすぐ下の人のインデクス
			int r_idx = UpperBound( s[idx] ) - 1;

			if ( l_idx <= prev ) l_idx = prev + 1;//一つ下のリーダーの手前まで

			count += r_idx - l_idx + 1;//カウントにリーダー自身を含める
		    
			prev = r_idx;
		    }

		    if ( n - count <= arg ) succ_r = mid;
		    else fail_r = mid;
		}

		if ( succ_r == INF ) System.out.println("NA");
		else System.out.println(succ_r);
	    }
	}
    }

    public static void main(String[] a) { new Main().solve(); }
}

