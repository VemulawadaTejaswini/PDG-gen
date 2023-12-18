import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[m];
			int[] b = new int[m];
			for(int i=0;i<m;i++){
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			
			int max = 0;
			int p = 0;
			int count = 0;
			while(true){
				count++;
				max = 0;
				for(int j=0;j<m;j++){
					if(a[j]<=p+1) max = Math.max(max,b[j]);
				}
				if(max==p){
					System.out.println("Impossible");
					break;
				}else if(max==n){
					System.out.println(count);
					break;
				}
				p = max;
			}

		}
	}	
}