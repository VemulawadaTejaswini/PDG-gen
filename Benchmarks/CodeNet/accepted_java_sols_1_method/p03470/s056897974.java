import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		Set<Integer> set=new HashSet<Integer>();

		int n=stdin.nextInt();
		for(int i=0;i<n;i++){
			int d=stdin.nextInt();
			set.add(d);
		}
		System.out.println(set.size());
	}
}