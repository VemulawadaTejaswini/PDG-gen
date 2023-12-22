import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] augs){

	    int a,b;

	    Scanner scan = new Scanner(System.in);
	    a = Integer.parseInt(scan.next());
	    b = Integer.parseInt(scan.next());
	    if(a >= -1000 && b <= 1000){
	    if(a > b){
	    	System.out.println("a > b");
	    }else if(a < b){
	    	System.out.println("a < b");
	    }else if(a == b){
	    	System.out.println("a == b");
	    }
	    }
	
	}


}