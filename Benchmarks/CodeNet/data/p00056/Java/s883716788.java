import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] pri = new int[50002];
		for(int i=2;i<=50000;i++){
			pri[i] = i;
		}
		for(int i=2;i<=100000;i++){
			for(int j=i+i;j<=50000;j+=i){
					pri[j]=0;
			}
		}
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int count = 0;
			for(int i=0;i<=n/2;i++){
				if(pri[i]>0){
					for(int j=0;j<n;j++){
						if(pri[j]>0){
							if(pri[i]+pri[j]==n){
								count++;
								break;
							}else if(pri[i]+pri[j]>n)break;
						}
					}
				}
			}
			System.out.println(count);
		}
	}	
}