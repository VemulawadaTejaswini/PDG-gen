import java.util.Scanner;

class Main {

	public static void main(String[] a) {
		
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		
		num1 = scan.nextInt(); num2 = scan.nextInt();
		System.out.println(GCD(num1,num2) + " " + LCM(num1,num2));
	}
	
	public static int GCD(int i, int j){
		
		if (i < 1 || j <1) return 1;
		if (i==j) return i;
		
		if (i<j) return GCD(i, j-i);
		else return GCD(j, i-j);
	}
	
	public static int LCM(int i, int j){
		return (i*j)/GCD(i,j);
	}
	

}