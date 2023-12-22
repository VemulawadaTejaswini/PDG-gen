import java.util.Scanner;
public class Main {
	public static void main(String[] args) {


        // Scannerクラスのインスタンスの生成
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum =  n * a;

        if (sum < b) {
        	System.out.println(sum);
        } else if (b < sum) {
        	System.out.println(b);

        } else if (sum == b) {
        	System.out.println(sum);
        }

	}



}