import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int[] d = new int[n];
			int maxd = 0;
			for(int i=0;i<n;i++) {
				d[i] = sc.nextInt();
				maxd = Math.max(maxd, d[i]);
			}
			
			int m = sc.nextInt();
			int[] t = new int[m];
			int maxt = 0;
			for(int i=0;i<m;i++) {
				t[i]= sc.nextInt();
				maxt = Math.max(maxt, t[i]);
			}
			
			int maxi = Math.max(maxd, maxt);
			
			Map<Integer,Integer> difd = new HashMap<Integer,Integer>(); 
			
			
			for(int i=0;i<n;i++) {
				if(!difd.containsKey(d[i])) {
					difd.put(d[i], 1);
				}else {
					difd.put(d[i], difd.get(d[i])+1);
				}
			}
			
			for(int i=0;i<m;i++) {
				if(!(difd.containsKey(t[i]))){
					System.out.println("NO");
					return;
				}
				if(!(difd.get(t[i])>0)){
					System.out.println("NO");
					return;
				}
				
				difd.put(t[i], difd.get(t[i])-1);
			}
			
			System.out.println("YES");
			
		}
		
		
		
	}
