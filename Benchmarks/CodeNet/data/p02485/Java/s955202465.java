import java.util.*;

public class main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
    	
    	while (1) {
    		String input = scanner.nextLine();
    		if (input.equals('0')) {
    			break;
    		}
        	int output = 0;
	        for (int i = 0; i < input.length(); i++) {
	        	ouput += Integer.perseInt(input.charAt(i));
	        }
	        System.out.println(output);
    	}
    }
}