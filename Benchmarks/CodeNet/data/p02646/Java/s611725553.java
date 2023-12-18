
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a,b,v,w,t;
		a = scan.nextInt();
		v = scan.nextInt();
		b = scan.nextInt();
		w = scan.nextInt();
		t = scan.nextInt();
		
		boolean canGet = false;
		
		for(int i=0;i<t;i++) {
			if(a+(v*i) == b+(w*i)) {
				canGet = true;
				break;
			}
		}
		
		if(canGet) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
