import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int length = (int)Math.log10(n)+1;
		int ans =0;
		
		if(length%9==0) {
				ans=sumDigits(n);
		}
		
		if(ans%9==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
	public static int sumDigits(int n) {
	    int sum = 0;
	    while (n != 0) {
	        sum += n % 10;
	        n /= 10;
	    }


	    return sum;//合計を返す
	}
}