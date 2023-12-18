import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();int B=stdIn.nextInt();
		int x=A+B,y=A-B,z=A*B;
		x=(int)Math.max(x, y);
		z=(int)Math.max(x, z);
		System.out.println(z);
	}
}