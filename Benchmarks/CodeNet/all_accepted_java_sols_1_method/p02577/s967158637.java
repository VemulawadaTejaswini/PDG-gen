import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t_input = sc.next();
		
		int count =0;
		for(int i = 0; i < t_input.length(); i++) {
			count+= Integer.parseInt(t_input.substring(i,i+1));
		}
		if(count % 9 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}