import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			Map<String, Integer> dictionary=new HashMap<>();
			for(int i=0; i<=n; i++) {
				String str=sc.nextLine();
				String[] token=str.split(" ");
				//System.out.println(token[0]);
				if(token[0].equals("insert")) {
					dictionary.put(token[1], 1);
				}
				else if(token[0].equals("find")) {
					if(dictionary.containsKey(token[1]))	System.out.println("yes");
					else	System.out.println("no");
				}
			}

		}
	}
}
