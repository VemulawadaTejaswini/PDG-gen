import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] pri = new int[1000002];
		
		pri[2] = 2;
		pri[3] = 3;
		pri[5] = 5;
		
		int a = 1;
		while(6*a<1000000){
			pri[6*a+1] = 6*a+1;
			pri[6*a+5] = 6*a+5;
			a++;
		}

		for(int i=7;i<1000000;i++){
			if(pri[i]>0){
				for(int j=i+i;j<1000;j+=i){
					pri[j]=0;
				}
			}
		}
	
		boolean exit = true;
		while(sc.hasNext()){
			int n = sc.nextInt();
			int sum=0;
			for(int i=2;i<=n;i++){
				if(pri[i]>0)sum++;
			}
			System.out.println(sum);
		}
	}
	
}