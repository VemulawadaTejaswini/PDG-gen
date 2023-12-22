import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		String S = stdIn.next();
		int ans = 0;
		for(int i = 0; i < N - 2; i++){
			if(S.substring(i,i+3).equals("ABC")){
				ans++;
			}
		}
		System.out.println(ans);
		stdIn.close();
	}
}
