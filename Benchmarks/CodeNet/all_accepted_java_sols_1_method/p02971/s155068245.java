import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int ans;
	int top = -1;
	int second = -1;

	int[] An ;
	String[] S;

	Main(){
		// 整数の入力
		n = sc.nextInt();
		An = new int[n];
		for(int i=0;i<n;i++){
			An[i] = sc.nextInt();
			if(An[i]>second){
				if(An[i]>top){
					second = top;
					top = An[i];
				} else {
					second = An[i];
				}
			}
		}

		// 出力
		for(int A:An){
			System.out.println(A==top?second:top);
		}
	}

	public static void main(String[] args){
		new Main();
	}
}