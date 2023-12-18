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
			int a = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();
			if((a|d|n)==0)break;
			int count = 0;
			int i=a;
			while(true){
				if(pri[i]>0)count++;
				if(count==n){
					System.out.println(i);
					break;
				}
				i += d;
			}
			
		}
	}
	
}