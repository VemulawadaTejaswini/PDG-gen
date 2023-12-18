import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner num = new Scanner(System.in);

		int a = num.nextInt();
		int b = num.nextInt();
		int c = num.nextInt();
		
		int temp = 0;	

		if(a > b){
			temp = b;
			b = a;
			a = temp;
			temp = 0;
		}
		if(b > c){
			temp = c;
			c = b;
			b = temp;
			temp = 0;
		}
		if(a > b){
			temp = b;
			b = a;
			a = temp;
			temp = 0;
		}
		System.out.printf("%d %d %d\n",a,b,c);
	}
}