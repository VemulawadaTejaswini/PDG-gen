import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ans = 0;
		for(int i=0; i<5; i++) {
			int x = sc.nextInt();
			if(x==0)
				ans = i+1;
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
