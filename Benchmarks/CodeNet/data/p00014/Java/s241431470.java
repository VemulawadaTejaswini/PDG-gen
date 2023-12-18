import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int d,Sum;
	
	public static void main(String[] args) {
		read();
		slove();
	}

	static boolean read(){
		d = sc.nextInt();
		return true;
	}
	
	static int func(int a){//f(x)ðvZ·éÖ
		return a * a;//øÌ2æðÔ·
	}
	
	static void slove(){
		int x = d;//¡
		int y = func(d);//c
		for(int i = 1; i*d < 600 ; i++){
			x = i*d;
			y = func(x);
			Sum = Sum + y * d ;
		}
		System.out.println(Sum);
	}

}