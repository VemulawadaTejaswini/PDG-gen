import java.util.*;

public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String args[]){
		while(true){
			int x = s.nextInt();
			int y = s.nextInt();
			if(x==0 && y==0) break;
			System.out.println(Math.min(x, y)+" "+Math.max(x, y));
		}
	}
}