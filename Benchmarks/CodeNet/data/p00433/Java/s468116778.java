import java.util.Scanner;
public class Score {

	public static void main(String[] args) {
		int ans = 0;
		for(int i=0;i<2;i++){
			int sum=0;
			for(int j=0;j<4;j++){
				Scanner stdIn = new Scanner(System.in);
				int p = stdIn.nextInt();
				sum += p;
			}
			ans = Math.max(sum, ans);
		}
		System.out.println(ans);
	}

}