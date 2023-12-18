
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		long a,b,v,w,t,xa,xb;
		a = scan.nextLong();
		v = scan.nextLong();
		b = scan.nextLong();
		w = scan.nextLong();
		t = scan.nextLong();
		
		boolean canGet = false;
		//	trueのとき+方向へ追いかけっこする
		boolean vector = false;
			
			if(a < b) {
				vector = true;
			}
			
			//	鬼の方が遅い場合捕まえられない
			if(w >= v) {
				System.out.println("NO");
				return;
			}
			
			if((vector && (a+v*t >= b+w*t)) || (!vector && (b-w*t >= a-v*t))) {
				canGet =true;
			}else {
				canGet =false;
			}
		
		if(canGet) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
