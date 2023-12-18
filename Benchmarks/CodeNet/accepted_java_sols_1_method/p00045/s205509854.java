import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,sum=0,av,count=0,tmp=0;
		while(sc.hasNext()){
			String str[]=sc.next().split(",");
			count++;
			a=Integer.parseInt(str[0]);
			b=Integer.parseInt(str[1]);
			sum+=(a*b);
			tmp+=b;
		}
		av=tmp/count;
		long ans1=(long)Math.round(av);
		System.out.println((int)sum);
		System.out.println(ans1);
	}
}