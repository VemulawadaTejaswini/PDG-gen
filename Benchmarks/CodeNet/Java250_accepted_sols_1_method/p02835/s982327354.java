import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int a,b,c;
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		System.out.printf((a+b+c)<=21?"win":"bust");
	}
}