import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b = s.nextInt();
		if(a>=-1000 && a<=1000 && b>=-1000 && b<=1000){
		if(a==b){
			System.out.println("a == b");
		}
		if(a>b){
			System.out.println("a > b");
		}
		if(a<b){
			System.out.println("a < b");
		}
		}
	}

}