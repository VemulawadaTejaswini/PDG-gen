import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int n = scan.nextInt();
		int maxv, minv;
		
		for(int i = 0; i < n; i++){
			int n = scan.nextInt();
			if(i == 0)
				minv = n;
			maxv = Math.max(maxv, n - minv);
			minv = Math.min(minv, n);
		}
		System.out.printf("%d\n", maxv);
	}
}