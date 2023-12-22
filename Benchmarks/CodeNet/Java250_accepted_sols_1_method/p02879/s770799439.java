import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] line = sc.nextLine().split(" ");
    	int numberOne = Integer.parseInt(line[0]);
    	int numberTwo = Integer.parseInt(line[1]);
    	
    	int result = 0;
    	if(numberOne > 9 || numberTwo > 9 ) {
    		result = -1;
    	}else {
    		result = numberOne*numberTwo;
    	}
    	System.out.println(result);
    	
    }
}