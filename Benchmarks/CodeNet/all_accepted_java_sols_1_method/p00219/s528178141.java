import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] a = new int[10];
			
			for(int i=0;i<n;i++){
				a[sc.nextInt()]++;
			}
						
			for(int i=0;i<10;i++){
				if(a[i]==0)System.out.print("-");
				for(int j=0;j<a[i];j++)System.out.print("*");
				System.out.println();
			}	
		}
	
	}	
}