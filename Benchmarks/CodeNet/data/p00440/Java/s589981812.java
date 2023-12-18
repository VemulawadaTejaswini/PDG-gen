import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			if(n==0 && k==0)break;
			
			int[] c = new int[n+1];
			for(int i=0;i<k;i++){
				c[sc.nextInt()]++;
			}
			
			int max = 0;
			int count = 0;
			if(c[0]==0){
				for(int t=1;t<=n;t++){
					if(c[t]>0){
						count++;
					}else if(c[t]==0){
						if(count>max)max=count;
						count=0;
					}
				}
				if(count>max)max=count;
			}else if(c[0]>0){
				for(int s=1;s<=n;s++){
					if(c[s]==0){
						c[s]++;
						for(int t=1;t<=n;t++){
							if(c[t]>0){
								count++;
							}else if(c[t]==0){
								if(count>max)max=count;
								count=0;
							}
						}
						if(count>max)max=count;
						c[s]--;
					}
				}
			}
			System.out.println(max);		
		}
	}	
}