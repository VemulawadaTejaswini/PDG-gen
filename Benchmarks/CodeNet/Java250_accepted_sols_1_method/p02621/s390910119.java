import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double kekka;
		int kekka2;
		
		if((1<=a)&&(a<=10)) {
			kekka = a+Math.pow(a,2)+Math.pow(a,3);
			kekka2 = (int)kekka;
			System.out.println(kekka2);
		}
		
		sc.close();

	}

}