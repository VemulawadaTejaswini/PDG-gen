import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {1,3,5,7,8,10,12},b= {4,6,9,11},c= {2};
		int x=sc.nextInt(),y=sc.nextInt();
		String X="",Y="";
		for(int i=0;i<7;i++) {
			if(x==a[i])X="a";	if(y==a[i])Y="a";
		}
		for(int i=0;i<4;i++) {
			if(x==b[i])X="b";	if(y==b[i])Y="b";
		}
		if(x==c[0])X="c";	if(y==c[0])Y="c";
		System.out.println(X==Y?"Yes":"No");
		sc.close();
	}
}