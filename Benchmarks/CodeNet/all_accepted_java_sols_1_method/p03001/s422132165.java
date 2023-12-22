import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double w = sc.nextLong();
		double h=sc.nextLong();
		long x = sc.nextLong();
		long y=sc.nextLong();
		System.out.print((w*h)/2+" ");
		if(w/2==x && h/2==y){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
}
