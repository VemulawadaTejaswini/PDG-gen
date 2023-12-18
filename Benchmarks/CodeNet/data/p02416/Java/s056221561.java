import java.util.Scanner;


class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r\n");
		int t=0;
		while(true){
			t=sc.nextInt();
			if(t==0)break;
			int a,b,c,d;
			a=t%1000;
			b=a%100;
			c=b%10;
			d=a/100+b/10+c;
			System.out.println(d+t/1000);
		}sc.close();
		}}