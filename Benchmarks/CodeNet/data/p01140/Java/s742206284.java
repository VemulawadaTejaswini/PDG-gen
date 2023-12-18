import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int count = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(0);
			int[] h = new int[n+1];
			int[] w = new int[m+1];
			for(int i=1;i<=n;i++){
				h[i] = h[i-1] + sc.nextInt();
				list.add(h[i]);
			}
			for(int i=1;i<=m;i++){
				w[i] = w[i-1] + sc.nextInt();
				for(int p=i-1;p>=0;p--){
					for(int q=0;q<=n;q++){				
						if(list.contains(h[q]-(w[i]-w[p]))==true) count++;
					}
				}	
			}
			
			System.out.println(count);
		}	
	}	
}