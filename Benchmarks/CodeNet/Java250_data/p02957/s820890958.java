import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] line = sc.nextLine().split(" ");
    	long firstNumber = Long.parseLong(line[0]);
    	long secoundNumber = Long.parseLong(line[1]);
    	String result = "";
    	if(firstNumber % 2 != secoundNumber % 2 ) {
    		result = "IMPOSSIBLE";
    	}else {
    		long tmp = (firstNumber + secoundNumber)/2;
    		result = String.valueOf(tmp);
    	}
    	
    	
    	System.out.println(result);
    	
	}
}