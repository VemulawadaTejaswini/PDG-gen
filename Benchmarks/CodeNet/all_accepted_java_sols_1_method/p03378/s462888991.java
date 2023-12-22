import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt(),x=sc.nextInt();
		List<Integer> a = new ArrayList<>();
		for(int i=0; i<m; i++) {
			a.add(sc.nextInt());
		}
		int cost1=0,cost2=0;
		for(int i=x; i<n; i++) {
			if(a.indexOf(i) != -1) cost1++;
		}
		for(int i=x; i>0; i--) {
			if(a.indexOf(i) != -1) cost2++;
		}
		System.out.println(cost1 < cost2 ? cost1:cost2);
	}
}
