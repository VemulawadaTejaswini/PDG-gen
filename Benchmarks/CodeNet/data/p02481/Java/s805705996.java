import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();		
		int b = sc.nextInt();

		int area = a * b/* ここを変えて面積を求めよう */;

		int length = (a + b) * 2/* ここを変えて周囲の長さを求めよう */;

		System.out.println(area + " " + length); 
		sc.close();
	}

}