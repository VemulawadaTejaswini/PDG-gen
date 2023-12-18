import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		int n = sc.nextInt();
		for(int i =0 ;i < n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			
			if(a*a+b*b==c*c || a*a+c*c == b || a*a == b*b+c*c){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}