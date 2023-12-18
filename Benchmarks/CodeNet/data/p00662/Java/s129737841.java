import java.util.Scanner;

//The Great Summer Contest
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt();
			if((a|b|c|d|e|f)==0)break;
			int A = a+d, B = b+e, C = c+f;
			int r1 = A/3+B/3+C/3+Math.min(A%3, Math.min(B%3, C%3)), m = Math.min(A, Math.min(B, C));
			int r2 = m+(A-m)/3+(B-m)/3+(C-m)/3;
			System.out.println(Math.max(r1, r2));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}