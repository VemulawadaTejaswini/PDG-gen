import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int counter=0;
		int n=in.nextInt();
		Set<Integer> S= new HashSet<Integer>();
		for (int i=0;i<n;i++) {
			S.add(in.nextInt());
		}
		int q=in.nextInt();
		Set<Integer> T= new HashSet<Integer>(q);
		for (int i=0;i<q;i++) {
			T.add(in.nextInt());
		}
		for (int elmnt: T){
			if (!(S.add(elmnt))) {
				counter++;
			}
		}
		System.out.printf("%d%n",counter);
	}
}