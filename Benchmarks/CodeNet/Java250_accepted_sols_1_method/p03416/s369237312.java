import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int a1,a2,a3,a4,a5;
		int count=0;
		for(int i=a;i<=b;i++){
			a1=i/10000;
			a2=i/1000-a1*10;
			a3=i/100-a1*100-a2*10;
			a4=i/10-a1*1000-a2*100-a3*10;
			a5=i-a1*10000-a2*1000-a3*100-a4*10;
			if(a1==a5 && a2==a4){
				count++;
			}
		}
		System.out.println(count);

	}
}
