import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int x = sc.nextInt();
			if(x == -1) break;

			System.out.println(Integer.toString(x,4));
		}
	}
}