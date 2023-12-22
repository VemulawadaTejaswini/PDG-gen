import java.util.Scanner;
public class Main {
	public static void main(String[] args) {


        // Scannerクラスのインスタンスの生成
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = (a + b) / 2;

        if ((a - k) == -(b - k) || -(a - k) == (b - k)) {
        	System.out.println(k);

        } else {
        	System.out.println("IMPOSSIBLE");
        }



	}



}