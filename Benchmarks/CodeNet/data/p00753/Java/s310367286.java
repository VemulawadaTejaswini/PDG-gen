import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int exit=0;
		while(exit==0){
			int n = sc.nextInt();
			if(n==0)exit=1;
			if(exit==0){
				int sum=0;
				for(int i=n+1;i<=n*2;i++){
					int flag=0;
					for(int j=2;j<i;j++){
						if(i%j==0){
							flag=1;
							j=i;
						}
					}
					if(flag==0)sum++;
				}
				System.out.println(sum);
			}
		}
	}
	
}