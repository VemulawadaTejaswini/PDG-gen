import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0)break;
			int[] pos = new int[m];
			
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					int in = sc.nextInt();
					if(in==1)pos[j]++;
				}
			}
			
			boolean go = true;
			for(int i=n;i>=0;i--){
				for(int j=0;j<m;j++){
					if(pos[j]==i){
						if(go==false)System.out.print(" ");
						System.out.print(j+1);
						go = false;
					}
				}
			}
			System.out.println();
			
		}
	}
}