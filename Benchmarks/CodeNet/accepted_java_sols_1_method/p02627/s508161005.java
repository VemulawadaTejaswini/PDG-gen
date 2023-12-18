import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    char val = sc.nextLine().charAt(0);
	    if(Character.isUpperCase(val)){
	        System.out.println('A');
	    }else{
	        System.out.println('a');
	    }
	}
}