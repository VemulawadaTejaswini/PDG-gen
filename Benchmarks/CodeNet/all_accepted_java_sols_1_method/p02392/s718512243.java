import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//入力した数値を変数に格納
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(0 <= a && a < b && b < c && c<=100){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}

