import java.util.Scanner;

public class Main {
	    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        
        String s = in.nextLine();
        s = in.nextLine();
        int counter = 0;
        int overseasCounter = 0;
        
        
        for (int x = 0; x < s.length(); x++){
        	if (s.charAt(x) == 'c'){
        		System.out.println("No");
        	} else {
        		if (s.charAt(x) == 'a' && counter < a + b){
        			System.out.println("Yes");
        			counter++;
        		} else if (s.charAt(x) == 'b' && counter < a + b  && overseasCounter < b){
        			System.out.println("Yes");
        			counter++;
        			overseasCounter++;
        		} else {
        			System.out.println("No");
        		}
        	}
        }        
        in.close();
    }
}
