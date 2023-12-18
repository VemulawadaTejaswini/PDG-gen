import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			int n = sc.nextInt();
			if(n==0) {
				sc.close();
				break;
			}
			
			String[] cnv1 = new String[n];
			String[] cnv2 = new String[n];
						
			for(int i=0; i<n; i++){
				cnv1[i] = sc.next();
				cnv2[i] = sc.next();
			}
			
			int m = sc.nextInt();
		
			for(int i=0; i<m; i++){
				int flg=0;
				String p = sc.next();
				for(int j=0; j<n; j++){
					if(p.equals(cnv1[j])){
						System.out.print(cnv2[j]);
						flg=1;
					}
					
				}
				if(flg==0) System.out.print(p);
			}
			System.out.println();
			
		}
		
	}
}