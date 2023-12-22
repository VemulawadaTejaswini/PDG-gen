import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] numberAandB = sc.nextLine().split(" ");
    	int numberCount  = Integer.parseInt(numberAandB[0]);
    	int startPoint = Integer.parseInt(numberAandB[1]);
    	
    	List<Integer> result = new ArrayList();
    	result.add(startPoint);
    	for(int i = 1;i<numberCount;i++) {
    		result.add(startPoint+i);
    		result.add(startPoint-i);
    	}
    	Collections.sort(result);
    	
    	String resultString = "";
    	for(int i = 0;i<result.size();i++) {
    		resultString+=result.get(i) + " ";
    	}
    	
    	
    	System.out.println(resultString.trim());
    	
    	
	}
}