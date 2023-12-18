import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	String w = input.next().toLowerCase();
    	int count = 0;
    	while(true){
    		String s = input.next().toLowerCase();
    		if(s.equals("end_of_text"))break;
    		if(s.equals(w))count++;
    	}
    	System.out.println(count);
    }
}