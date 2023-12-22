import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p1 = 0, p2 = 0;
		
		for(int i = 0; i < n; i++){
			String s1 = sc.next();
			String s2 = sc.next();
			int comp = s1.compareTo(s2);
			if(comp > 0) p1 += 3;
			else if(comp < 0) p2 += 3;
			else{
				p1++;
				p2++;
			}
		}
		
		System.out.println(p1 + " " + p2);
	}
}
