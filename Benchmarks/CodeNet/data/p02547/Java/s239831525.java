import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
public class Main {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		Vector<Integer> v=new Vector();
		for (int T=1; T<=t; T++) {
			int a=ob.nextInt();
			int b=ob.nextInt();
			v.add(a);
			v.add(b);
		}
		int k=0;
		for (int i=0; i<=v.size()-6; i+=2) {
			if (v.get(i)==v.get(i+1)&&v.get(i+2)==v.get(i+3)&&v.get(i+4)==v.get(i+5)) {
				k=1;
				break;
			}
		}
		if (k==1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}