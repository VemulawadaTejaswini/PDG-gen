import java.util.*;
public class Main {
	public static void main(String [] args) {
		Set<String> h = new HashSet<String>();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			String str = in.next();
			
			
			
			if(str.contains("insert")) {
				h.add(in.next());
				
			}
			
			
			
			else if(h.contains(in.next())) {
					System.out.println("yes");
				}
				
				
			else {
					System.out.println("no");
			}
			}
		}
	}
		


	



