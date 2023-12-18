import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean go = false;
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			if(go==true) System.out.println();
			go = true;
			
			int max = 0;
			int[] sum = new int[n];
			String[] name = new String[n];
			
			for(int i=0;i<n;i++){
				name[i] = sc.next();
				sum[i] = sc.nextInt()*3 + sc.nextInt()*0 + sc.nextInt()*1;
				max = Math.max(max, sum[i]);
			}
			
			for(int i=max;i>=0;i--){
				for(int j=0;j<n;j++){
					if(sum[j]==i) System.out.println(name[j] + "," + sum[j]);
				}
			}
		}
	}	
}