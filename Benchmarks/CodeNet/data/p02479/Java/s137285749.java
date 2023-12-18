import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);

		int r = sc.nextInt();  // 半径

		double area = Math.PI * r * r;  // 面積
		double length = 2 * Math.PI * r;  // 周の長さ
		System.out.println(area + " " + length);
	}
}