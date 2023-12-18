import java.util.Scanner;
import java.util.HashSet;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> hs = new HashSet<Integer>(n);
		int count = 0;

		for(int i=0; i<n; i++){
			hs.add(sc.nextInt());
		}

		int q = sc.nextInt();

		for(int i=0; i<q; i++){
			if(hs.contains(sc.nextInt())==true) count++;
		}

		System.out.println(count);
	}
}