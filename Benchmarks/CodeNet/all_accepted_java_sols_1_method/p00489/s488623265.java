import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = (n*(n-1))/2;
			int[] sum = new int[n];
			int a, b, c, d;
			for(int i=0;i<m;i++){
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();
				if(c>d){
					sum[a-1] += 3;
				}else if(d>c){
					sum[b-1] += 3;
				}else{
					sum[a-1]++;
					sum[b-1]++;
				}
			}

			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				list.add(sum[i]);
			}
			Collections.sort(list);
			
			for(int i=0;i<n;i++){
				System.out.println(n-(list.lastIndexOf(sum[i])));
			}
			
		}
		
	}	
}