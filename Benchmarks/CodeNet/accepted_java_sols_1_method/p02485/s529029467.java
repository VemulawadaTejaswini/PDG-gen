import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	while(true){
	    int sum = 0;
	    String str = s.next();
	    char st = str.charAt(0);
	    if(st == '0') break;
	    
	    for(int i = 0 ; i < str.length() ; i++){
		char c = str.charAt(i);
		sum += c - '0';
		
	    }
	    System.out.println(sum);
	}
    }
}