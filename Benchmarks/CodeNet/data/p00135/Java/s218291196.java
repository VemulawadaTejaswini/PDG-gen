import java.util.Scanner;

//Clock Short Hand and Long Hand
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			String[] s = sc.next().split(":");
			int h = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			double x = h*30.0 + 30.0*m/60.0;
			double y = m*6;
			double d = Math.min(Math.abs(x-y), Math.abs(y-x));
			System.out.println(0<=d&&d<30?"alert":90<=d&&d<=180?"safe":"warning");
		}
	}
}