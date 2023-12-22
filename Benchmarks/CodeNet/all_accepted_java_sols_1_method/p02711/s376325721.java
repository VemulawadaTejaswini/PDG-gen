import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main{
    public static void main(String[] args) throws IOException {
        	Scanner sc = new Scanner(System.in);
        	String s = sc.next();
        	boolean flag = false;
        	for(int i=0;i<s.length();i++) {
        		if(s.charAt(i)=='7') {
        			System.out.println("Yes");
        			flag=true;
        			break;
        		}
        	}
        	if(flag==false) {
        		 System.out.println("No");
        	} 
    }
}
