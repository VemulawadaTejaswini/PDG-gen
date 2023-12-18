import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] pri = new int[300001];
		for(int i=2;i<=300000;i++){
			pri[i] = i;
		}

		for(int i=2;i<=300000;i++){
			for(int j=i+i;j<=300000;j+=i){
					pri[j]=0;
			}
		}
		
		boolean exit = true;
		while(exit==true){
			int n = sc.nextInt();
			if(n==0)exit=false;
			if(exit==true){
				int sum=0;
				for(int i=n+1;i<=n+n;i++){
					if(pri[i]>0)sum++;
				}
				System.out.println(sum);
			}
		}
	}
	
}