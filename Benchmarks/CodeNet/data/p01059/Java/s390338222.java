import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		PrintWriter pw=new PrintWriter(System.out);
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[] L=new int[m];
		
		for(int i=0;i<m;i++){
			L[i]=sc.nextInt();
		}
		int gap=0;
		for(int i=0;i<m-1;i++){
			if(gap<Math.abs(L[i]-L[i+1])){
				gap=Math.abs(L[i]-L[i+1]);
			}
		}

		if(gap<Math.abs(L[0]-(1-L[0]))){
			gap=Math.abs(L[0]-(1-L[0]));
		}
		if(gap<Math.abs(L[m-1]-(n+1+n-L[m-1]))){
			gap=Math.abs(L[m-1]-(n+1+n-L[m-1]));
		}
		if((gap-1)%2==0){
			pw.println((gap-1)/2);
		}
		if((gap-1)%2==1){
			pw.println((gap-1-1)/2+1);
		}
		
		sc.close();
		pw.close();
	}

}