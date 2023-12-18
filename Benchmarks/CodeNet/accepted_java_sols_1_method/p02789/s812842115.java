import java.util.*;
public class  Main{
	public static void main(String[] args) {
		try{
			Scanner s1 = new Scanner(System.in);
			int n = s1.nextInt();
			int m = s1.nextInt();
			if(n == m)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}