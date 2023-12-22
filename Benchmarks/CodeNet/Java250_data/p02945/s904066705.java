import java.util.*;
public class Main{
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		System.out.println(max(a+b,max(a*b,a-b)));
	}
	public static int max(int a,int b){
		return (a>b)?a:b;
	}
}