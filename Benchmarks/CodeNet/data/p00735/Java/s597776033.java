import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		boolean[] E=new boolean[300001];
		for(int i=2;i<=300000;i++) if(i%7==1 || i%7==6) E[i]=true;
		for(int i=2;i<=548;i++) if((i%7==1 || i%7==6) && E[i]) {
			for(int j=i*i;j<=300000;j+=i) E[j]=false;
		}

		while(true){
			int n=sc.nextInt();
			if(n==1) break;
			System.out.printf(n+":");
			for(int i=2;i<=n;i++) if(n%i==0 && E[i]) System.out.printf(" "+i);
			System.out.println();
		}

		return;
	}
}