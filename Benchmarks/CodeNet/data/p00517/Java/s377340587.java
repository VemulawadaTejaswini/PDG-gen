import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		for(int i=0;i<n;i++){
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		
		int nx=x[0],ny=y[0],cnt=0;
		for(int i=1;i<n;i++){
			while(nx!=x[i]||ny!=y[i]){
				if(x[i]>nx&&y[i]>ny){//斜め右上
					nx++;ny++;
				}else if(x[i]<nx&&y[i]<ny){//斜め左下
					nx--;ny--;
				}else if(y[i]>ny){//上
					ny++;
				}else if(y[i]<ny){//下
					ny--;
				}else if(x[i]>nx){//右
					nx++;
				}else if(x[i]<nx){//左
					nx--;
				}
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}