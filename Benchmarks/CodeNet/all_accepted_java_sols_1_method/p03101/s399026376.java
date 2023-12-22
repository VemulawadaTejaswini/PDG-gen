import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int d=scan.nextInt();
	//int e=scan.nextInt();
	//int f=scan.nextInt();
	//String str1=scan.next();
	//String str2=scan.next();
	boolean bool=false;
	System.out.println(a*b-c*b-a*d+c*d);
	}
}
