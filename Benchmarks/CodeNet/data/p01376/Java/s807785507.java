import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int p;
			int max = 0;
			
			for(int i=0;i<m;i++){
				p = 0;
				for(int j=0;j<n;j++){
					p += sc.nextInt();
				}
				max = Math.max(max, p);
			}
			System.out.println(max);
		}
	}	
}