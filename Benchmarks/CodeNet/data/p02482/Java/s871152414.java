import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sanner=new Scanner(System.in);
		String[] s=sanner.nextLine().split(" ");
		int a=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[1]);
		if(a<b){
			System.out.println("a < b");
		}
		else if(a>b){
			System.out.println("a > b");
		}
		else{
			System.out.println("a == b");
		}
	}
}