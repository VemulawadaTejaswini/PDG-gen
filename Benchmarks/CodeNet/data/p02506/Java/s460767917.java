import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	String w = input.next().toLowerCase();
    	int count = 0;
    	while(true){
    		String s = input.next();
    		if(s.equals("END_OF_TEXT"))break;
    		s = s.toLowerCase();
    		if(s.equals(w))count++;
    	}
    	System.out.println(count);
    }
}