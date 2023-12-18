import java.util.*;

public class Main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int T = (17+4+5+X) % 7;
		switch(T){
			case 1:
				System.out.println("sun");
				break;
			case 2:
				System.out.println("mon");
				break;
			case 3:
				System.out.println("tue");
				break;
			case 4:
				System.out.println("wed");
				break;
			case 5:
				System.out.println("thu");
				break;
			case 6:
				System.out.println("fri");
				break;
			case 0:
				System.out.println("sat");
				break;
		}
	}
}
