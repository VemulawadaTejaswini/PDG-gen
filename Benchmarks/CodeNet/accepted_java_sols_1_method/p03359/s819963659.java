import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final int a=sc.nextInt(),b=sc.nextInt();
		if(a>b){
			System.out.println(a-1);
		}else{
			System.out.println(a);
		}
	}
}
