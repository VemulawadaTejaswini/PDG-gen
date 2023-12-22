import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main{	
	public static void main(String[] arts){
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<String>();
		String command,str;
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			command = sc.next();
			str = sc.next();
			if(command.equals("insert"))
				set.add(str);
			else{
				if(set.contains(str))
					System.out.println("yes");
				else
					System.out.println("no");
			}
		}
	}
}
