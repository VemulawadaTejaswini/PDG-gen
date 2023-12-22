import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		int w=i.nextInt();
		int h=i.nextInt();
		int x=i.nextInt();
		int y=i.nextInt();
		int r=i.nextInt();
		if((x-r<0)||(y-r<0)||(w<x+r)||(h<y+r))System.out.println("No");
		else System.out.println("Yes");
	}
}