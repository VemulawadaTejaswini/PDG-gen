import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int m = sc.nextInt();
			if(m==0) break;
			
			int[] mx = new int[m];
			int[] my = new int[m];
			for(int i=0;i<m;i++){
				mx[i] = sc.nextInt();
				my[i] = sc.nextInt();
			}
			
			int n = sc.nextInt();
			int[] nx = new int[n];
			int[] ny = new int[n];
			for(int i=0;i<n;i++){
				nx[i] = sc.nextInt();
				ny[i] = sc.nextInt();
			}
			
			for(int z=0;z<n;z++){
				int x = nx[z]-mx[0];
				int y = ny[z]-my[0];
				boolean flag = true;
				for(int i=0;i<m;i++){
					for(int j=0;j<n;j++){
						if(mx[i]+x==nx[j] && my[i]+y==ny[j]) break;
						if(j==n-1) flag = false;
					}
					if(flag==false) break;
				}
				if(flag==true){
					System.out.println(x + " " + y);
					break;
				}
			}
		}
	}	
}