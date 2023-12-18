import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n,x; 
		while(true){
			n = s.nextInt();
			x = s.nextInt();
			if(n==0&&x==0){
				break;
			}
			int cnt=0;
			for(int i=1;i<=n;i++){
				for(int j=i+1;j<=n;j++){
					for(int t=j+1;t<=n;t++){
						if(i+j+t==x){
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}