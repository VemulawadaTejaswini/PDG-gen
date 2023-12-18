import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primax = 250000;
		int[] pri = new int[primax+10000];
		for(int i=2;i<=primax;i++) pri[i] = i;
		for(int i=2;i<=primax+1;i++){
			for(int j=i+i;j<=primax;j+=i){
					pri[j]=0;
			}
		}
		
		while(true){
			int n = sc.nextInt();
			int p = sc.nextInt();
			if(n==-1 && p==-1) break;
			
			int[] a = new int[p+1];
			int count = 0;
			for(int i=n+1;;i++){
				if(pri[i]>0){
					a[count] = pri[i];
					count++;
				}
				if(count==p+1) break;
			}
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<=p;i++){
				for(int j=i;j<=p;j++){
					list.add(a[i]+a[j]);
				}
			}
			Collections.sort(list);
			System.out.println(list.get(p-1));
		}
	}
}