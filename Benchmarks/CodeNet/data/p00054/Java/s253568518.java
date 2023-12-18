import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private void mainrun() {
		scan = new Scanner(System.in);

		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = scan.nextInt();
			
			looprun(a,b,n);
		}
	}
	
	private void looprun(int a,int b,int n) {
		int Ans = 0;
		int num = (a % b) * 10;
		for(int i = 0;i < n;i++) {
			Ans += num / b;
			
			num = (num % b) * 10;
		}
		
		System.out.println(Ans);
	}
}
