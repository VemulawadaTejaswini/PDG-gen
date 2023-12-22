import java.util.*;
public class Main {
	//定義関数から参照できる変数定義はこの辺
	static int S;
	static int Ary[]=new int[1000001];
	static int ans=0;

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		S = sc.nextInt();
		Ary[1] = S;
		loop1:for(int i=1;i<=1000000;i++){
			if (Ary[i]%2==0) {
				Ary[i+1] = Ary[i]/2;
				for(int j=1;j<=i;j++){
					if (Ary[j]==Ary[i+1]) {
					 	ans=i+1;
					 	break loop1;
					} 
				}
			}
			else{
				Ary[i+1] = Ary[i]*3+1;
					for(int j=1;j<=i;j++){
					if (Ary[j]==Ary[i+1]) {
					 	ans=i+1;
					 	break loop1;
					} 
				}
			}
		}
		System.out.println(ans);
    }
}