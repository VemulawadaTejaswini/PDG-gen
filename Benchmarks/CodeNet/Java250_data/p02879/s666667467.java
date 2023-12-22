import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.exec();
	}
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		if(!inRange(a) || !inRange(b)) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(a*b);		
	}
	
	boolean inRange(int a) {
		if(a >= 1 && a <= 9) {
			return true;
		}else {
			return false;
		}
	}

}