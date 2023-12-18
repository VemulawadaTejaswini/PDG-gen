import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int t = sc.nextInt();
			int e = sc.nextInt();
			int[] x = new int[n];
			for(int i=0;i<n;i++){
				x[i] = sc.nextInt();
			}
			
			boolean flag = true;
			for(int i=0;i<n;i++){
				for(int j=t-e;j<=t+e;j++){
					if(j%x[i]==0){
						System.out.println(i+1);
						flag = false;
						j = t+e+1;
						i = n;
					}
				}
			}
			if(flag==true) System.out.println("-1");
		}
	}	
}