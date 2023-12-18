import java.util.Scanner;
public class Main
{

	public static void main (String arg[]) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		scan.close();
		int su = waru((int)a,(int)b);
		int su2 = amari((int)a,(int)b);
		double su3 = kakeru(a,b);
		System.out.print(su+" "+su2+" ");
		System.out.printf("%5.5f",su3);


	}
	static int waru(int a,int b){
		int kekka = a / b;
		return kekka;
	}

	static int amari(int a,int b){
		int kekka = a % b;
		return kekka;
	}
	static double kakeru(double a,double b){//浮動小数点演算
		double kekka = a / b;
		return kekka;
	}

}
