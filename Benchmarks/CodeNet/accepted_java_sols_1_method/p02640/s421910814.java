import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	
        //sec--1
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        //sec--2
        //鶴と亀の数の組合せが存在する
        if(2*X <= Y && 4*X >= Y && Y%2==0 ) {
        System.out.println("Yes");
        } else {
        //鶴と亀の数の組合せが存在しない
        System.out.println("No");
        }
   }
}
