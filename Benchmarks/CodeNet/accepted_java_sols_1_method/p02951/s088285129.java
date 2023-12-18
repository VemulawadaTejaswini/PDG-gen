import java.util.Scanner;
public class Main {
	public static void main(String[] args) {


        // Scannerクラスのインスタンスの生成
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = 0;

        d = (b + c) - a;
        if (d < 0) {
        	System.out.println(0);
        } else {
        System.out.println(d);
        }



	}



}