import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a,b,tmp;
		a = scan.nextInt();
		b = scan.nextInt();
		for(;;){
		if(a >= b){
			tmp = a;
			a = b;
			b = tmp;
		}
			System.out.println(""+a+" "+b);
		
		if (a == 0 && b == 0)
			break;
		}
		
		}
	
}