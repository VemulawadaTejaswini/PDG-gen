import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int D= stdIn.nextInt();
		int ans = 0;
		int cnt = 0;
		cnt = D * 2 + 1;
		ans = N / cnt;
		if(N % cnt == 0){
			System.out.println(ans);
		}
		else{
			System.out.println(ans + 1);
		}
		stdIn.close();
	}
}