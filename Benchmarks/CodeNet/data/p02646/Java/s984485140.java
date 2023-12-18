
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
		
		boolean canGet = false;
		//	trueのとき+方向へ追いかけっこする
		boolean vector = false;
			
			if(a < b) {
				vector = true;
			}
			
			if((vector && (v-w > b-a)) || (!vector && (v-w > a-b))) {
				System.out.println("YES");
				return;
			}
			
			if(vector) {
				for(int i=1;i<t;i++) {
					a = a+v;
					b = b+w;
					if(v-w > b-a) {
						canGet =true;
						break;
					}
				}
			}else {
				for(int i=1;i<t;i++) {
					a = a-v;
					b = b-w;
					if(v-w > a-b) {
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
