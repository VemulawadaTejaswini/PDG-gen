import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int z=1;
		while(z!=0){
			z=x%y;
			x=y;
			y=z;
		}
		System.out.println(x);
	}
}
