import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdn = new Scanner(System.in);
		
		
		int a = stdn.nextInt();
		int b = stdn.nextInt();
		int flg = 0;
		int d = 0;
		int r = 0;
		double f = 0;
		
		do{
			if(a > 1 && b <=1000000000){
				d = a / b;
				r = a % b;
				f =(double) a /(double) b;
				break;
			}else{
				a = stdn.nextInt();
				b = stdn.nextInt();
			}
		}while(flg == 1);
		
		System.out.println(d + " " + r + " " + f);
	}
}