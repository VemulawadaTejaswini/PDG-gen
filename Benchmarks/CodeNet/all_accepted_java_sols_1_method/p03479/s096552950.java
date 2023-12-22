import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong(), Y = sc.nextLong();
		
		int count = 0;
		
		while(X <= Y) {
			count++;
			X *= 2;
		}
		
		System.out.println(count);
	}

}
