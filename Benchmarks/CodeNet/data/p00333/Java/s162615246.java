import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int W = s.nextInt();
		int H = s.nextInt();
		int C = s.nextInt();
		
		int a = 0;
		int b = 0;
		int c = 0;
		int x = 0;
		
		if(W>H){
			a = W;
			b = H;
		}else{
			a = H;
			b = W;
		}                   
		
		
		while(C>0){
			if(a%b != 0){
				c = a;
				a = b;
				b = c%b;
				
			}else{
				x = b;
				break;
			}
		}
		
		System.out.println(W/x * H/x * C);         
	}
}