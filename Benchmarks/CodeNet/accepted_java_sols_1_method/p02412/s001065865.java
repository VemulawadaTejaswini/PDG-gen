import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int i,j,k,cnt;
		
		while(true){
			cnt=0;
		    int n=scan.nextInt();
		    int x=scan.nextInt();
		    if(n==0 && x==0)break;
			
		    for(i=n;i>=3;i--){
			    for(j=i-1;j>=2;j--){
				    for(k=j-1;k>=1;k--){
					    if(i+j+k==x)cnt++;
				    }
			    }
		    }
			System.out.println(cnt);
		}
	}
}
