import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int rnum = 0;
		for(char x : s.toCharArray()) {
			if(x == 'R')
				rnum += 1;
		}
		if(rnum > N - rnum)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}