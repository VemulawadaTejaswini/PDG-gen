import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		String s = "No";

		for(int i = 0; i <= X; i ++){
			if(Y == (2 * i + 4 * (X - i))){
				s = "Yes";
				break;
			}
		}
		System.out.println(s);
	}
}