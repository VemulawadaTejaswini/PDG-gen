import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String predict = sc.nextLine();
    	String actual = sc.nextLine();

    	int result = 0;
    	for(int i = 0;i<predict.length();i++) {
    		char predictChar = predict.charAt(i);
    		if(predictChar == actual.charAt(i)) {
    			result++;
    		}
    	}

    	System.out.println(result);
    }
}