import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		for(int i=0;i<Math.max(a,b);i++){
			System.out.print(Math.min(a,b));
		}
		System.out.println();
	}
}
