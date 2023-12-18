
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for(int i=0;i<n;i++){
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();
			
			if(a<b){
				if(b<c){
					func(c,a,b);
				}
				else{
					func(b,a,c);
				}
			}
			else{
				if(a<c){
					func(c,a,b);
				}
				else{
					func(a,b,c);
				}
			}
		}
	}
	
	static void func(int a,int b,int c){
		if(Math.pow(a,2) == (Math.pow(b,2)+Math.pow(c,2))){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}