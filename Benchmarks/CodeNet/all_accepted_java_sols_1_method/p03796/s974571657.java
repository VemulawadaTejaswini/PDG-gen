import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int times=sc.nextInt();
	private static long power;
	public static void main(String[] args){
		power=1;
		for(int i=1;i<=times;i++){
			power=(power*i)%1000000007;
		}
		System.out.println(power);
	}
}