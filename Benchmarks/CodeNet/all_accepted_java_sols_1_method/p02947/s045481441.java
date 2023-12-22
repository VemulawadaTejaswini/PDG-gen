import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			
			String[] S = new String[n];
			
			for(int i=0;i<n;i++) {
				char[] s = sc.next().toCharArray();
				Arrays.sort(s);
				String str = new String(s);
				S[i] = str;
				
			}
			
			Arrays.sort(S);
			long ret = 0;
			long one = 1;
			Map<String,Long> m = new HashMap<String,Long>();
			
			for(int i=0;i<n;i++) {
				m.merge(S[i], one, Long::sum);
			}
			
			for(Map.Entry<String, Long> e:m.entrySet()) {
				ret+=e.getValue()*(e.getValue()-1)/2;
			}
			
			System.out.println(ret);
		}
		
	}
