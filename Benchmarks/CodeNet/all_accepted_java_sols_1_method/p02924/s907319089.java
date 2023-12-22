import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,x,y,z;
	long n;
	long ans;
	String[] S;

	Main(){
		n = sc.nextLong();
		for(long i=1;i<n;i++){
			ans += i;
		}

		// 出力
		System.out.println(ans);
	}

	public static void main(String[] args){
		new Main();
	}
}