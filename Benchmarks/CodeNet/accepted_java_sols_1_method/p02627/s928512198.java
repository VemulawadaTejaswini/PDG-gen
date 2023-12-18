import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    char ch = sc.next().charAt(0);
	    if(Character.isUpperCase(ch)){
	        System.out.println("A");
	    } else{
	        System.out.println("a");
	    }
	}
}