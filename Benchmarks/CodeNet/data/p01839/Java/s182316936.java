import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			if(n%2 != 0) {
				System.out.println("No");
			}else {
				List<String> list = new ArrayList<>();
				Aun:
				for(int i=0; i<n; i++) {
					String aun = sc.next();
					
					if(aun.equals("A"))	{
						list.add("A");
					}if(aun.equals("Un")) {
						if(list.isEmpty()) {
							System.out.println("No");
							break Aun;
						}else {
							list.remove(0);
						}
					}
					if(i == n-1) {
						System.out.println("Yes");
					}
				}
					//System.out.println("No");
			}
			
			
				
		}
	}
}
