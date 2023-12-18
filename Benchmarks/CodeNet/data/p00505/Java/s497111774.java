import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		boolean end = false;
		int tri = 0;
		int ei = 0;
		int cho = 0;
		int don = 0;
		while(stdIn.hasNext()){
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();
			if(!end){
				// ソート
				if(a>b){
					int tmp = a;
					a = b;
					b = tmp;
				}
				if(a>c){
					int tmp = a;
					a = c;
					c = tmp;
				}
				if(b>c){
					int tmp = b;
					b = c;
					c = tmp;
				}

				// 三角形存在条件
				// |b-c|<a<b+c
				if(Math.abs(b-c)<a&&a<b+c){
					tri++;

					// 鋭角条件
					// a^2+b^2 > c^2
					if(a*a+b*b>c*c){
						ei++;
					}
					// 直角条件
					else if(a*a+b*b==c*c){
						cho++;
					}
					// 鈍角
					else{
						don++;
					}
				}
				else{
					// 入力無視
					end = true;
				}
			}
		}
		System.out.println(tri+" "+cho+" "+ei+" "+don);
	}
}