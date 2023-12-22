import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int c[]=new int[7];
		while(true){
			n=sc.nextInt();
			if(n==0) break;
			Arrays.fill(c, 0);
			
			for(int i=0;i<n;i++){
				int k=sc.nextInt();
				int m=60;
				for(int j=0;j<7;j++){
					if(m<=k){
						c[6-j]++;
						break;
					}
					m-=10;
				}
			}
			for(int j=0;j<7;j++){
				System.out.println(c[j]);
			}
		}
	}

}