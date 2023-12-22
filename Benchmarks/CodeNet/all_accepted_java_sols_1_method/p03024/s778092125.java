import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] torikumi = sc.next().toCharArray();
		int lose = 0;
		for(char c:torikumi) {
			if(c=='x')
				lose++;
		}
		
		System.out.println(lose>=8 ? "NO" : "YES");
		sc.close();
	}
}
