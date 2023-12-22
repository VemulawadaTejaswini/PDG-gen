
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		boolean ans=true;
		for (char c='a'; c<='z'; c++){
			int count = 0;
			
			for (int i=0; i<s.length(); i++){
				if (s.charAt(i)==c)
					count++;
			}
			
			if (count%2==1){
				ans=false;
				System.out.println("No");
				break;
			}
		}
		
		if (ans==true)
			System.out.println("Yes");

	}

}
