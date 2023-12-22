import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		HashSet<Integer> a = new HashSet<>();
		int k=0;
		
		for(int i=0;i<n;i++) {
			k=sc.nextInt();
			a.add(k);
		}
		
		if(a.size()==n) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		sc.close();
	}
}