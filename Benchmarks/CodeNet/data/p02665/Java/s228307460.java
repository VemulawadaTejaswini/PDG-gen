import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N;
	static int n;
	static int x;
	static int b;
	static int c;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list_1 =new ArrayList<Integer>();
		N=sc.nextInt();
		for(int a=0;a<=N;a++) {
			list_1.add(sc.nextInt());
		}
		n=list_1.size();
		if(list_1.get(0)!=0&&N!=0) {
			x=-1;
		}
		else {
			for(int a=1;a<=n;a++) {
				b=list_1.get(n-a);
				x=x+b+c;
				if(b%2==1||b==0) {
					c=b/2+1;
				}
				else {
					c=b/2;
				}
			}
		}	
		System.out.println(x);
	}
}