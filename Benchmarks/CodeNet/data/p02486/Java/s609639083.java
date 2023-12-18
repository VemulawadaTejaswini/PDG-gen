import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int cnt=0;
		while(true){
			int n=sc.nextInt();
			int x=sc.nextInt();
			if(n==0 && x==0) break;
			for(int i=1;i<=n-2;i++){
				for(int j=i+1;j<=n-1;j++){
					for(int k=j+1;k<=n;k++){
						if(i+j+k==x&&i!=j&&i!=k&&j!=k){
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