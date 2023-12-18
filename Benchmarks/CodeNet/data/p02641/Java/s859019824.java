import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int p[] = new int[n];
		List<Integer> all = new ArrayList<>();
		for(int i=0; i<n; i++) {
			p[i] = sc.nextInt();
		}
		int flag=0;
		for(int i=1; i<=100; i++) {
			flag=0;
			for(int j=0; j<n; j++) {
				if(p[j]==i) {
					flag=1;
				}
			}
			if(flag==0) {
				all.add(i);
			}
		}

		
		int min = 100;
		int ans = x;
		for(int i=0; i<all.size(); i++) {
			if(min > Math.abs(x - all.get(i))) {;
			min = x-all.get(i);
			ans = all.get(i);
			}
		}
		System.out.println(ans);
	}
}
