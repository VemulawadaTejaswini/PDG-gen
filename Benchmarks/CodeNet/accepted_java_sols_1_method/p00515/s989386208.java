import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int  l = sc.nextInt();
		int  a = sc.nextInt();
		int  b = sc.nextInt();
		int  c = sc.nextInt();
		int  d = sc.nextInt();
		int ave;
		if(a<40) a=40;
		if(b<40) b=40;
		if(c<40) c=40;
		if(d<40) d=40;
		if(l<40) l=40;
		ave=(a+b+c+d+l)/5;
		System.out.println(ave);
	}
}