import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner scan = new Scanner(System.in);
        List<String> printList = new ArrayList<String>();
 
        String str = scan.next();
        int n = scan.nextInt();
     
        for (int i = 0; i < n; i ++) {
            String op = scan.next();
            int start = scan.nextInt();
            int end = scan.nextInt() + 1;
         
       		if ("replace".equals(op)) {
            	String replaceStr = scan.next();
            	str = str.substring(0, start) + replaceStr + str.substring(end, str.length());
        	} else if ("reverse".equals(op)) {
          		str = str.substring(0, start) + new StringBuffer(str.substring(start, end)).reverse().toString() + str.substring(end, str.length());
        	} else if ("print".equals(op)) {
           		printList.add(str.substring(start, end));
        	}
    	}
 
    	for (String s : printList) {
        	System.out.println(s);
    	}
 
	}
}