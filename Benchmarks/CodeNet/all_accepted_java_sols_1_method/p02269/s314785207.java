import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			Set<String> dictionary=new HashSet<>();
			for(int i=0; i<n; i++) {
				String str=sc.next();
				String token=sc.next();
				//System.out.println(token[0]);
				if(str.equals("insert")) {
					dictionary.add(token);
				}
				else{
					if(dictionary.contains(token))	System.out.println("yes");
					else	System.out.println("no");
				}
			}

		}
	}
}

