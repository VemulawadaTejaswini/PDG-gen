import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int l = Integer.parseInt(sc.next());
		sc.close();
		int min = 200 + 100;
		int rin = 0;
		int sum=0;
		for(i=0;i<n;i++) {
			rin = l + i;
			sum+=rin;
//			System.out.println(rin);
			if(Math.abs(rin)<Math.abs(min))min=rin;
		}
		System.out.println(sum-min);
	}
}
