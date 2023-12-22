import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String line = sc.nextLine();
    	int inputNumber = Integer.parseInt(line);
    	String result = "No";
    	for(int i = 1;i<=9;i++) {
    		for(int j = 1;j<=9;j++) {
    			int tmp = i*j;
    			if(inputNumber == tmp) {
    				result = "Yes";
    			}
    		}
    	}
    	System.out.println(result);
    	
    }
}