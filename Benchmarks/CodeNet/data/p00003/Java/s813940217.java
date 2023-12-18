import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dataSet = Integer.parseInt(scanner.nextLine());
		List<String[]>  l = new ArrayList<>();
		
		for (int i = 0; i < dataSet; i++) {			
			String[] s = scanner.nextLine().split(" ");
			l.add(s);
		}
		for(int i = 0; i<l.size();i++){
			String[] s = l.get(i);
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
		
			int sqA = a*a;
			int sqB = b*b;
			int sqC = c*c;
			
			if((sqA+sqB)==sqC){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		
	}
	}
}