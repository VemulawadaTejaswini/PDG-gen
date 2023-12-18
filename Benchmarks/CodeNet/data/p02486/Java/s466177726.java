import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,x,cnt;
		while(true){
			n=sc.nextInt();
			x=sc.nextInt();
			cnt=0;
			if(n+x==0)break;
			for(int i=1;i<x/3&&i<=n-2;i++){
				for(int j=i+1;j<x/2&&j<=n-1;j++){
					for(int k=j+1;k<=n;k++){
						if(i+j+k==x){
							cnt++;
							break;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}