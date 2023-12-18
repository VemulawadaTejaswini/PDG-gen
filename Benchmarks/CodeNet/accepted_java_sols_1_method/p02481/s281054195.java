import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(new InputStreamReader(System.in));
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.printf("%d %d\n",a*b,2*(a+b));
		}finally{
			scan.close();
		}
	}
}