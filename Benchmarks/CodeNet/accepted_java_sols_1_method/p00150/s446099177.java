import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primax = 10000;
		int[] pri = new int[primax+100];
		for(int i=2;i<=primax;i++) pri[i] = i;
		for(int i=2;i<=primax+1;i++){
			for(int j=i+i;j<=primax;j+=i){
					pri[j]=0;
			}
		}
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			for(int i=n;i>0;i--){
				if(pri[i]>0 && pri[i-2]>0){
					System.out.println((i-2) + " " + i);
					break;
				}
			}
		}
	}	
}