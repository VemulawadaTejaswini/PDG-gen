import java.util.Scanner;

//Kongo Type
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long SIGN = 0x80000000;
		long INT = 0x7fffff80;
		long FLOAT = 0x7f;
		while(n--!=0){
			long X = Long.parseLong(sc.next(), 16);
			long a = (X&INT)>>7;
			double b = 0, dt = 0.5;
			long f = X&FLOAT;
			long pos = 1L<<6;
			while(0 < pos){
				if((f&pos)>0){
					b+=dt;
				}
				pos >>= 1;
				dt/=2;
			}
			double res = (a+b) * (((X&SIGN)>0)?-1:1);
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}