import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] pos=sc.nextLine().split(" ");
		double x1=Double.parseDouble(pos[0]);
		double y1=Double.parseDouble(pos[1]);
		double x2=Double.parseDouble(pos[2]);
		double y2=Double.parseDouble(pos[3]);
		double ans=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println(ans);
	}
}