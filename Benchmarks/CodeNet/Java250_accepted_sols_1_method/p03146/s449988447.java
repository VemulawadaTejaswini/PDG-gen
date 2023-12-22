import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;


public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int s =sc.nextInt();

		long a[]=new long[1000001];
		Map<Long,Integer> m=new HashMap<Long,Integer>();

		int n=2;

		a[1]=s;
		boolean c=false;

		Stack<Long> box= new Stack<Long>();
		m.put(a[1],1);

		while(c==false){
			if(a[n-1]%2==0)a[n]=a[n-1]/2;
			else a[n]=3*a[n-1]+1;

			if(m.get(a[n])!=null){
				c=true;
				System.out.println(n);
			}
			else m.put(a[n], n);

			++n;

		}


	}
}