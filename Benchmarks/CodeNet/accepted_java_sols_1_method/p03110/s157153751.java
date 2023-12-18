import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double money[] = new double[N];
		String unit[] = new String[N];
		double otosidama[] = new double[N];
		double sum = 0;
		for (int i = 0; i < money.length; i++){
			money[i] = sc.nextDouble();
			unit[i] = sc.next();
			
		}

		for (int j = 0; j < money.length; j++){
			if(unit[j].equals("BTC")){
				otosidama[j] = money[j] * 380000.0;
			}
			else if(unit[j].equals("JPY")){
				otosidama[j] = money[j];
			}else{
System.out.println("DEBUG");
}
		}
		for (int k = 0; k < otosidama.length; k++){
			sum += otosidama[k];

		}
		System.out.println(sum);
	}
}