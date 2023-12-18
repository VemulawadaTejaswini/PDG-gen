import java.util.HashMap;
import java.util.Scanner;

public class Main{ 
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			
			while(sc.hasNext()) {
				HashMap<String,Integer> hm = new HashMap<>();
				int n = sc.nextInt();
				for(int i=0;i<n;i++) {
					hm.put(sc.next(), 0);
				}
				int m= sc.nextInt();
				int open=0;
				for(int i=0;i<m;i++) {
					String str = sc.next();
					if(!hm.containsKey(str))
						System.out.println("Unknown by "+str);
					else {
						if(open==0) {
							System.out.println("Opened by "+str);
							open=1;
						}
						else {
							System.out.println("Closed by "+str);
							open=0;
						}
					}
				}
				
			}
		}
	}
}

