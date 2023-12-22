import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 3; i++) {
			sb.append(sc.next());
		}
      
     	System.out.println(Integer.parseInt(sb.toString()) % 4 == 0 ? "YES" : "NO");
	}
}