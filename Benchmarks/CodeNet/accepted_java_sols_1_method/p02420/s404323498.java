import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				String input = sc.next();
				
				if(input.equals("-")) break;
				
				int m = sc.nextInt();
				List<Integer> hList = new ArrayList<>();
				for(int i = 0; i < m; i++) {
					hList.add(sc.nextInt());
				}
				
				String shuffle = input;
				for(int i : hList) {
					shuffle = shuffle.substring(i) + shuffle.substring(0, i);
				}
				
				sb.append(shuffle);
				sb.append("\n");
			}
			
			System.out.print(sb.toString());
		}
	}
}
