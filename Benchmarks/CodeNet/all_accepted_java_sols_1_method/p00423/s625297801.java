import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		while(n != 0){
			int sumA = 0;
			int sumB = 0;
			for(int i = 0; i < n; i++){
				int a = scan.nextInt();
				int b = scan.nextInt();
				if(a > b){
					sumA = sumA + a + b;
				}else if(b > a){
					sumB = sumB + a + b;
				}else{
					sumA = sumA + a;
					sumB = sumB + b;
				}
			}
			System.out.println(sumA + " " + sumB);
			n = scan.nextInt();
		}
	}
}