	import java.util.*;
	
	
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			Integer a[] = new Integer[N];
			for (int i =0;i<N;i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a,Collections.reverseOrder());
			
			int sumAlice = 0;
			int sumBob = 0;
			
			for (int j=0;j<N;j++) {
				if (j%2 == 0) {
					sumAlice += a[j];
				}else {
					sumBob += a[j];
				}
			}
			
			int res = sumAlice - sumBob;
			
			System.out.println(res);
		}
		
		
	}