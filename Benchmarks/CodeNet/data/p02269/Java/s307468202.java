import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			Set<String> dictionary=new HashSet<>();
			for(int i=0; i<n; i++) {
				String str=sc.nextLine();
				String[] token=str.split(" ");
				//System.out.println(token[0]);
				if(token[0].equals("insert")) {
					dictionary.add(token[1]);
				}
				else{
					if(dictionary.contains(token[1]))	System.out.println("yes");
					else	System.out.println("no");
				}
			}

		}
	}
}
