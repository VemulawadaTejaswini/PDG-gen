import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int a= scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int temp;
		
		if(a>b){
			temp=a;
			a=b;
			b=temp;
		}
		
		if(b>c){
			temp=b;
			b=c;
			c=temp;
		}
		
		if(a>b){
			temp=a;
			a=b;
			b=temp;
		}
		
		System.out.println(Integer.toString(a)+" "+Integer.toString(b)+" "+Integer.toString(c));
		scanner.close();
	}
}