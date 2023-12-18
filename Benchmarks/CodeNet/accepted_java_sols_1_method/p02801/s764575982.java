import java.util.*;
public class Main {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
        String value = sc.next();
        int charValue = value.charAt(0);
        if((charValue >= 65 && charValue < 90) || (charValue >= 97 && charValue < 122)){
            String next = String.valueOf( (char) (charValue + 1));
            System.out.println(next);
        }
        else if(charValue == 90 || charValue == 122) {
            System.out.println(String.valueOf( (char) (charValue)));
        }
        else {
            System.out.println("Please input Character");
        }
        
	}
}