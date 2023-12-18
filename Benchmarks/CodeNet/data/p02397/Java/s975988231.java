import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		while (x!=0&&y!=0){
		if (x!=0&&y!=0&&x<y)System.out.println(x+" "+y);
		else if(x!=0&&y!=0)System.out.println(y+" "+x);
		x=s.nextInt();
		y=s.nextInt();
	}}}