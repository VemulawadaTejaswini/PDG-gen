import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] cost = new int[n];
		for(int i=0;i<n;i++) a[i] = sc.nextInt();
		
		int pos;
		boolean flag = false;
		cost[0] = 1;
		for(int i=1;;i++){
			for(int j=0;j<n;j++){
				if(cost[j]==i){
					for(int k=1;k<=6;k++){
						pos = j+k;
						cost[pos] = i+1;
						while(a[pos]!=0){
							pos += a[pos];
							if(0<cost[pos] && cost[pos]<=i+1) break;
							else cost[pos] = i+1;
						}
						if(cost[n-1]>0){
							j = n;
							flag = true;
							break;
						}	
					}
				}
			}
			if(flag==true){
				System.out.println(i);
				break;
			}
		}	
	}	
}