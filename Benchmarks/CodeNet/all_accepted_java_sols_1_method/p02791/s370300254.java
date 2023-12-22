import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int min = sc.nextInt();
		int cnt = 1;
		
		for(int i=1;i<n;i++) {
			int p = sc.nextInt();
			if(p<=min) {
				cnt++;
			}
			if(p<min)
				min = p;
		}
		
		System.out.println(cnt);

	}

}
