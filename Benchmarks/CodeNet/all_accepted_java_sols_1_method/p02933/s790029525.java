import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int inputScore = Integer.parseInt(sc.nextLine());
    	String inputNumber = sc.nextLine();
    	
    	String result = "";
    	if(inputScore >= 3200) {
    		result = inputNumber;
    	}else {
    		result = "red";
    	}

    	
    	System.out.println(result);
    }
}