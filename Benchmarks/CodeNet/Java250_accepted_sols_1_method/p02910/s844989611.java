import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		String str = S;
		
        for(int i = 1; i <= S.length(); ++i) {
    		
        	if(i % 2 == 1 && str.startsWith("L")) {
        		
        		System.out.println("No");
        		scan.close();
        		return;
        		
        	} else if(i % 2 == 0 && str.startsWith("R")) {

        		scan.close();
        		System.out.println("No");
        		return;
        		
        	}
        	
        	str = str.substring(1);
        }
		
		System.out.println("Yes");
		
		scan.close();
	}

}
