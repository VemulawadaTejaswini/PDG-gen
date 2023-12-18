import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count =0;
		
		for(int i=0; i<n; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			count += r-l+1;
		}
		sc.close();
		
		System.out.println(count);

	}

}
