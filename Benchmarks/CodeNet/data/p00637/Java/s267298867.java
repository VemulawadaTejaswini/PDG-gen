import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[] p = new int[n];
			for(int i=0;i<n;i++) p[i] = sc.nextInt();
			
			boolean flag = false;
			for(int i=0;i<n;i++){
				if(flag==false){
					if(i!=0) System.out.print(" ");
					System.out.print(p[i]);
					if(i<n-1 && p[i+1]==p[i]+1) flag = true;
				}else if(flag==true && (i==n-1 || p[i+1]!=p[i]+1)){
					System.out.print("-" + p[i]);
					flag = false;
				}
			}
			System.out.println();
		}	
	}	
}