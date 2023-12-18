import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),s=0,t,i,j;
		sc.close();
		for(i=1;i<=n;i+=2) {
			t=0;
			for(j=1;j<=i;j++) if(i%j==0) t++;
			if(t==8) s++;
		}
		System.out.print(s);
	}
}