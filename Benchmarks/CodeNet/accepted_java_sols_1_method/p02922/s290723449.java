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
		n = 1;

		// 文字列の入力
		while(n<b){
			n += a-1;
			ans++;
		}

		// 出力
		System.out.println(ans);
	}

	public static void main(String[] args){
		new Main();
	}
}