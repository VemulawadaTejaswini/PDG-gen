import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n=scan.nextInt();
		Set<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			set.add(scan.nextInt());
		}
		int c=0;
		int k=scan.nextInt();
		for (int i = 0; i < k; i++) {
			if(set.contains(scan.nextInt()))
				c++;
		}
		System.out.println(c);
	}

}