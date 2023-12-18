import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] pri = new int[1000002];
		for(int i=2;i<=1000000;i++){
			pri[i] = i;
		}
		for(int i=2;i<=1000000;i++){
			for(int j=i+i;j<=1000000;j+=i){
					pri[j]=0;
			}
		}

		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int count=0;
			
			for(int i=0;i<=n/2;i++){
				if(pri[i]!=0 && pri[n-i]!=0)count++;
			}
			System.out.println(count);
			

		}
	}
	