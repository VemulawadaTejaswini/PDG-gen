import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] pri = new int[1000001];
		
		for(int i=2;i<=1000000;i++){
			pri[i] = i;
		}

		for(int i=2;i<=1000000;i++){
			for(int j=i+i;j<=1000000;j+=i){
					pri[j]=0;
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