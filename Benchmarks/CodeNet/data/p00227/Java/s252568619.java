import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				int m=sc.nextInt();
				if((n|m)==0)	break;
				int[] p=new int[n];
				for(int i=0; i<n; i++) {
					p[i]=sc.nextInt();
				}
				Arrays.sort(p);
				int cost=0, count=0;
				for(int i=n-1; i>=0; i--) {
					count++;
					cost+=(count%m==0)?0:p[i];
				}
				System.out.println(cost);
			}
			
		}
	}	
}
