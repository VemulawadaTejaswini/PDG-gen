import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] d = new int[k];
			Set<Integer> a = new HashSet<Integer>();
			
			for(int i=0;i<k;i++) {
				d[i] = sc.nextInt();
				for(int j=0;j<d[i];j++) {
					a.add(sc.nextInt());
				}
			}
			
			System.out.println(n-a.size());
		}
		
		
	}
