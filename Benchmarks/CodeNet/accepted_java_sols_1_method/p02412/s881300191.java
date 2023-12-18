import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		while(true){
			int n=stdIn.nextInt();
			int x=stdIn.nextInt();
			int ans=0;
			if(n==0&&x==0)
				System.exit(0);
			for(int i=1;i<=n;i++){
				for(int j=i+1;j<=n;j++){
					for(int k=j+1;k<=n;k++){
						if(i+j+k==x)
							ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}

