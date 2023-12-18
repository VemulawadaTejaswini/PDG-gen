import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int ans;
	String[] S;

	Main(){
		// 整数の入力
		a = sc.nextInt();
		b = sc.nextInt();

		// 出力
		System.out.println((a-b)%2==0?(a+b)/2:"IMPOSSIBLE");
	}

	public static void main(String[] args){
		new Main();
	}
}