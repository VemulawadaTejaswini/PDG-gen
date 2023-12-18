import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double a = sc.nextInt();
		double b = sc.nextInt();
		double x = sc.nextInt();
		double menseki = Math.pow(a, 2)*b;
		double kakudo;
		double yuyo;
		double waterLevel = x/(Math.pow(a, 2));


		if(2*x > menseki){
			yuyo = b - waterLevel;
			kakudo = Math.atan(yuyo/(a/2));
			kakudo = kakudo*180.0/Math.PI;
		}else{
			kakudo = Math.atan(b/(2*x/(a*b)));
			kakudo = kakudo*180.0/Math.PI;
		}
		System.out.println(kakudo);

		sc.close();
	}
};