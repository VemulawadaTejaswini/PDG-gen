import java.util.Scanner;

class Main{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		int a = 1*scan.nextInt();
		int b = 5*scan.nextInt();
		int c = 10*scan.nextInt();
		int d = 50*scan.nextInt();
		int e = 100*scan.nextInt();
		int f = 500*scan.nextInt();
		
		if(a+b+c+d+e+f >=1000){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
}