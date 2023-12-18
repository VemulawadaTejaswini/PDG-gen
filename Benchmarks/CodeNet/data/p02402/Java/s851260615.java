import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int n = Integer.parseInt(std.next());
		int max = -1000001;
		int min = 1000001;
		long sum = 0;
		for(int i=1; i<=n; i++ ){
			int nxt = Integer.parseInt(std.next());
			if (max<nxt) max = nxt;
			if (nxt<min) min = nxt;
			sum += nxt;
		}
		System.out.println(min+" "+max+" "+sum);
	}
}