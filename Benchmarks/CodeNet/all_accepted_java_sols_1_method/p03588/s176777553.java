import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	int n = in.nextInt();
	int max = 0;
	int ans = 0;

	for(int cnt = 0; cnt < n; cnt++){
		int a = in.nextInt();
		int b = in.nextInt();
		if(a > max){
			max = a;
			ans = b + a;
		}
	}
	System.out.println(ans);

	}
}