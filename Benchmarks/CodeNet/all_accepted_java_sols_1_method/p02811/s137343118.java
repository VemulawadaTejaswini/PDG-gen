import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k,x;
		k = sc.nextInt();
		x = sc.nextInt();
		if(500 * k >= x){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
