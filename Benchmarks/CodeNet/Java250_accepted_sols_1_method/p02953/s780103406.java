import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int ans;
	int[] h;
	boolean flg=true;
	String[] S;

	Main(){
		n = sc.nextInt();
		h = new int[n];
		for(int i=0;i<n;i++)
			h[i]=sc.nextInt();

		for(int j=n-1;j>0;j--){
			if(h[j]<h[j-1]){
				if(h[j-1]-h[j]==1){
					h[j-1]-=1;
				} else {
					flg=false;
					break;
				}
			}
		}

		// 出力
		if(flg)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static void main(String[] args){
		new Main();
	}
}