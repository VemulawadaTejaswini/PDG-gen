import java.util.*;

public class Main {
    private static Scanner scr;
	public static void main(String args[]){
	    scr = new Scanner(System.in);
		String[] str = scr.nextLine().split(" ",0);;
		int l = Integer.parseInt(str[0]);
		int h = Integer.parseInt(str[1]);
		System.out.println( (l*h) + " " + ((l+h)*2) );
        
	}
}