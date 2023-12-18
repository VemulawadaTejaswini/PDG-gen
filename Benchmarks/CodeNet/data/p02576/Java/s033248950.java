import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		int t = s.nextInt();
		
		System.out.println((int)Math.ceil((double)n/(double)x) * t);
		

	}

}