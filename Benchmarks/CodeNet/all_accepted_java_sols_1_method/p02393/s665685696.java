import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		
		int big=0, min=0, half=0;
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		if(a>b && a>c){
			big = a;
			if(b>c){
				half = b;
				min = c;
			}else{
				half = c;
				min = b;
			}
		}
		if(a<b && b>c){
			big = b;
			if(a>c){
				half = a;
				min = c;
			}else{
				half = c;
				min = a;
			}
		}
		if(a<c && c>b){	
			big = c;
			if(a>b){
				half = a;
				min = b;
			}else{
				half = b;
				min = a;
			}
		}
		System.out.println(min+" "+half+" "+big);
	}
}