 import java.io.*;
import java.util.*;


class Main {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    char a=s.next().charAt(0);
	    if(Character.isUpperCase(a))
		System.out.println('A');
	    if(Character.isLowerCase(a))
		System.out.println('a');
	}
}
