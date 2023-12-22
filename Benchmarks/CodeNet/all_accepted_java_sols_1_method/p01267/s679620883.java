import java.util.*;
public class Main {
	static int n,a,b,c,x;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			n=in.nextInt();//リールの数
			a=in.nextInt();//定数
			b=in.nextInt();//定数
			c=in.nextInt();//定数
			x=in.nextInt();//乱数値
			if(n+a+b+c+x==0)break;
			int data[]= new int[n];
			for(int i=0;i<n;i++)data[i]=in.nextInt();
			int cnt=0,frame=0,ans=x;
			while(true){
				if(ans==data[frame]){
					frame++;
					x=ans;
				}
				ans=(a*ans+b)%c;
				if(cnt>10000){
					System.out.println("-1");
					break;
				}
				if(frame==n){
					System.out.println(cnt);
					break;
				}
				cnt++;
			}
		}
	}
}