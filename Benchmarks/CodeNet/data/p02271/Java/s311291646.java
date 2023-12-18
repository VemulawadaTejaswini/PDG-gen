import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		//int numNodes = scan.nextInt();
		Combination c = new Combination(scan.nextInt());
		c.loadNumbers(scan);
		c.fullComb();
		Iterator<Integer> iter;
		iter = c.getIter();

		int queryNum = scan.nextInt();
		q: for(int i=0 ;i<queryNum; i++){
			iter = c.getIter();
		int tmp = scan.nextInt();
		while(iter.hasNext()){
			if(tmp == iter.next()){
				System.out.println("yes");
				continue q;
			}
		}
			System.out.println("no");
		}
	//	while(iter.hasNext())
			//	System.out.println(iter.next());
	}
}


class Combination {
    int[] c;
    int n;
	int[] numbers;
	HashSet<Integer> sum = new HashSet<Integer>();
    public Combination(int n){
			numbers = new int[n];
			this.n = n;
    }
		public void loadNumbers(Scanner scan){
		for(int i=0; i < numbers.length ; i++)
				numbers[i] = scan.nextInt();
		}
	public void comb(int r){
		c = new int[r];
		combine(0,r);
	}
	public void fullComb(){
		for(int i=1 ;i<n;i++)
			comb(i);
	}
    public void combine( int m, int r ) {
        if ( m < r ) {
          for ( int i = m; i<=n-r+m; i++ ){
             c[m] = numbers[i];
             combine(m+1,r);
          }
        }else{
			int tmp = 0;
          for ( int i=0; i<r; i++ ){
            // System.out.print(" " + c[i]);
          tmp += c[i];
        	}
        	sum.add(tmp);
        }
}
	Iterator<Integer> getIter(){
			return sum.iterator();
	}
    }