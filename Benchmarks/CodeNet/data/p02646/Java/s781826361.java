
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a,b,v,w,t,xa,xb;
		a = scan.nextInt();
		v = scan.nextInt();
		b = scan.nextInt();
		w = scan.nextInt();
		t = scan.nextInt();
		
		xa = a;
		xb = b;
		
		boolean canGet = false;
		//	trueのとき+方向へ追いかけっこする
		boolean vector = false;
			
			if(xa < xb) {
				vector = true;
			}
			
			if(vector) {
				for(int i=1;i<=t;i++) {
					xa = xa+v;
					xb = xb+w;
					if(v-w > xb-xa) {
						canGet =true;
						break;
					}
				}
			}else {
				for(int i=1;i<=t;i++) {
					xa = xa-v;
					xb = xb-w;
					if(v-w > xa-xb) {
						canGet =true;
						break;
					}
				}
			}
		
		if(canGet) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
