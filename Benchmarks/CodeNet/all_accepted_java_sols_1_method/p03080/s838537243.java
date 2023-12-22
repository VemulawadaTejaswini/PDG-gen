import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int bl=s.replaceAll("R","" ).length();
		int rl=s.replaceAll("B","" ).length();
		if(rl>bl) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}