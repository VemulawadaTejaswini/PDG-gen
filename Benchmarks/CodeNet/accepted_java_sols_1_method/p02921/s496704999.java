import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int ans;
	String[] S1,S2;

	Main(){
		// 文字列の入力
		String s1 = sc.next();
		S1 = s1.split("");
		String s2 = sc.next();
		S2 = s2.split("");
		for(int i=0;i<3;i++){
			ans += S1[i].equals(S2[i])?1:0;
		}

		// 出力
		System.out.println(ans);
	}

	public static void main(String[] args){
		new Main();
	}
}