import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		
		int a, b, c;
		a = sin.nextInt();
		b = sin.nextInt();
		c = sin.nextInt();
		
		if(a < b && b < c){
			System.out.println("Yes");
		
		}else{
			System.out.println("No");
		}
		
	}
}
