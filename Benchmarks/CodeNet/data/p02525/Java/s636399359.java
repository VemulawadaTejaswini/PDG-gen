import java.util.Scanner;
//import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int s[]= new int[1000];
		int sum=0;
		double ave,stndrd=(double)0;
		for (int i=0;i<n;i++) {
			s[i]=in.nextInt();
			sum+=s[i];
		}
		ave=(double)sum/(double)n;
		for(int j=0;j<n;j++){
			stndrd+=((double)s[j]-ave)*((double)s[j]-ave)/(double)n;
		}
		stndrd=Math.sqrt(stndrd);
		System.out.printf("%f%n",stndrd);
	}
}