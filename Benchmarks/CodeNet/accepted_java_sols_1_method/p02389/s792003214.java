import java.util.Scanner;

class Main{
	public static void main(String[] args){
	
		Scanner x = new Scanner(System.in);
	
		int a = x.nextInt();
		int b = x.nextInt();
		System.out.println(a*b + " " + (a+b)*2);
	}
}