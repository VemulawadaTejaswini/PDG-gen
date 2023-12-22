import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),a=scan.nextInt(),b=scan.nextInt(),t1,t2,s=0,i;
		scan.close();
		for(i=1;i<=n;i++) {
			t1=i;
			t2=0;
			do {
				t2+=t1%10;
				t1/=10;
			}while(t1>0) ;
			if(t2>=a&&b>=t2) s+=i;
		}
		System.out.print(s);
	}
}