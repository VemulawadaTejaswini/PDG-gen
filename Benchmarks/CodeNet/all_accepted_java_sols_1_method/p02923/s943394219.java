import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,h,k,l,m,n,w,x,y,z;
	int ans;
	String[] S;

	Main(){
		// 整数の入力
		n = sc.nextInt();

		m = sc.nextInt();
		for(int i=1;i<n;i++){
			h = sc.nextInt();
			if(m<h){
				if(ans<w)ans=w;
				w=0;
			} else {
				w++;
			}
			m=h;
		}
		if(ans<w)ans=w;

		// 出力
		System.out.println(ans);
	}

	public static void main(String[] args){
		new Main();
	}
}