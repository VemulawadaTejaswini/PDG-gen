import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),x=scan.nextInt(),m,s=n,t=1000,i;
		for(i=0;i<n;i++) {
			m=scan.nextInt();
			if(t>m) t=m;
			x-=m;
		}
		scan.close();
		s+=x/t;
		System.out.print(s);
	}
}