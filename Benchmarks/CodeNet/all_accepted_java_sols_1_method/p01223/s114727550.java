import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			final int m = sc.nextInt();
			
			int before = sc.nextInt();
			int m_max = 0;
			int max = 0;
			for(int j = 1; j < m; j++){
				int cur = sc.nextInt();
				
				if(cur - before > 0){
					if(max < (cur - before)){
						max = cur - before;
					}
				}else{
					if(m_max > (cur - before)){
						m_max = cur - before;
					}
				}
				
				before = cur;
			}
			
			System.out.println(max + " " + (-m_max));
		}
	}
}