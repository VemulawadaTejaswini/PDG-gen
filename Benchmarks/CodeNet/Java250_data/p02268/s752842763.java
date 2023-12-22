import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int s=scan.nextInt();
		Set<Integer> set=new  HashSet<Integer>();
		for (int i = 0; i < s; i++) {
			set.add(scan.nextInt());
		}
		int q=scan.nextInt();
		int v=0;
		for (int i = 0; i < q; i++) {
			int a=scan.nextInt();
			if(!set.add(a))
			{
				v++;
			}
		}
		PrintWriter pw=new PrintWriter(System.out);
		pw.println(v);
		pw.close();

	}

}