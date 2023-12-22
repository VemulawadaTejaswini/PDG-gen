import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long c = stdIn.nextLong();
		long d = stdIn.nextLong();
		long ans[] = new long[4];
		ans[0] = a*c;
		ans[1] = a*d;
		ans[2] = b*c;
		ans[3] = b*d;
		long max = ans[0];
		for(int i = 0; i < 4; i++){
			if(max <= ans[i]){
				max = ans[i];
			}
		}
		System.out.println(max);
		stdIn.close();
	}
}