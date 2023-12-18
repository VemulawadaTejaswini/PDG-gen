import java.util.*;
import java.lang.Math;

public class Main { 
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in); 
		// radius 半径
		int radius = sc.nextInt();
		// 面積 = 半径 * 半径 * Pi
		double area = radius * radius * Math.PI;
		// 円周 = 直径 * Pi
		double leng = (radius *2)* Math.PI;
		System.out.println(area + " " + leng);
	}
}


