
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int n=300000;
		Scanner sc=new Scanner(System.in);
		boolean ms[]=new boolean[n];

		for(int i=0;i<n;i++){
			if(i%7==1 || i%7==6){
				ms[i]=true;
			}
			else ms[i]=false;
		}
		ms[1]=false;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(ms[i]){
				for(int j=i*2;j<n;j+=i){
					ms[j]=false;
				}
			}
		}
		while(true){
			int m=sc.nextInt();
			if(m==1) break;
			boolean flag=true;
			for(int i=0;i<n;i++){
				if(ms[i] && m%i==0){
					if(flag){
						System.out.print(m+":");
					}
					System.out.print(" "+i);
					flag=false;
				}
			}
			System.out.println();
		}
	}
}