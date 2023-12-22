import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int week = scan.nextInt();
		double num = 100000;
		double n=1000.0;
		int i;
		
		for(i=0;i<week;i++){
			num *= 1.05;
			num = Math.ceil(num / n) * n;
		}
		System.out.println((int)num);
		scan.close();
	}
}