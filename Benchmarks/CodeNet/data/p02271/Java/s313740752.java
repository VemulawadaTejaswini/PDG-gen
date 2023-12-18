import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
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
		//iter = c.getIter();
	//	while(iter.hasNext())
		//	System.out.println(iter.next());
	}
}


class Combination {
    int[] c;
    int n;
    int r;
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	HashSet<Integer> sum = new HashSet<Integer>();
    public Combination(int n){
			this.n = n;
    }
	public void loadNumbers(Scanner scan){
	for(int i=0; i <this.n; i++)
		numbers.add(scan.nextInt());
	}

	public void comb(int r){
		this.r = r;
		c = new int[r];
		for(int i=0; i<n-(r-1);i++){
		//	System.out.println("loop:" + i);
			c[0] = numbers.get(i);
			combine(1,i);
		}
	}
	public void fullComb(){
		for(int i=1 ;i<=n;i++){
	//	System.out.println("r : " + i);
			c=new int[i];
			r=i;
			combine(0,0);
		}
	}
    public void combine( int m ,int index){
        if ( m == r ) {
			int tmp = 0;
          for ( int i=0; i<r; i++ ){
           //  System.out.print(" " + c[i]);
          	tmp += c[i];
        	}
        //	System.out.println("");
        	sum.add(tmp);
        }else{
        //  for ( int i = index + 1; i<n-(r-m-1); i++ ){
        for ( int i = index; i<n-(r-m-1); i++ ){
             c[m] = numbers.get(i);
             combine(m+1,i+1);
        }
        }
	}
	Iterator<Integer> getIter(){
			return sum.iterator();
	}
    }