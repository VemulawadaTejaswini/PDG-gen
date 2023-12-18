import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int sum = n;
		boolean[] x=new boolean[1000001];
		int[] all=new int[n];
		for(int i=0;i<n;i++){
			int t = sc.nextInt();
			x[t] = true;
			all[i] = t;
		}
		Arrays.sort(all);
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(x[all[j]]){
					if((all[j]%all[i])==0){
						x[all[j]] = false;
					}
				}
			}
			if(!x[all[i]]){
				sum--;
			}
		}
		System.out.println(sum);
	}
}
