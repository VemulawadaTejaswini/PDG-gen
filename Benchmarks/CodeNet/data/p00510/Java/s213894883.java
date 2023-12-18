import java.util.Scanner;

public class Main {

	public static void main(String[] a) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int max = m;
		int now = max;
		boolean flag = false;
		for(int i=0;i<n;i++){
			int in = stdIn.nextInt();
			int out = stdIn.nextInt();
			now += in;
			now -= out;
			if(now<0){
				flag = true;
			}
			if(max<now) max = now;
		}
		if(flag) System.out.println("0"); else System.out.println(max);
	}
}