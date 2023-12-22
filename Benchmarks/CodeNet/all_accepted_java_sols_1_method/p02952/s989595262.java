import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int line = Integer.parseInt(sc.nextLine());
    	int result = 0;
    	for(int i = 1;i<=line;i++) {
    		int numberLength = String.valueOf(i).length();
    		if(numberLength%2 == 1) {
    			result++;
    		}
    	}
    	System.out.println(result);
    	
	}
}