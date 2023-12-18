import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int R = s.nextInt();
		int a = H + R;
		int ans = 1;
		
		if(a<0){
			ans = -1;
		}else if(a == 0){
			ans = 0;
		}
		
		System.out.println(ans);
	}
}