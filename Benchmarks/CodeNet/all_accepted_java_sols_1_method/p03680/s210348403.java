import java.util.Scanner;
import java.util.Vector;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Vector<Integer> v=new Vector<Integer>();

		for(int i=0; i<n; i++) {
			int z=sc.nextInt();
			z--;
			v.add(z);
		}
		int now=0; int c=0;
		for(;;) {
			if(now==1) {
				System.out.println(c);
				break;
			}
			if(c>=n) {
				System.out.println(-1);
				break;
			}
			c++;
			now=v.get(now);
		}
	}
}