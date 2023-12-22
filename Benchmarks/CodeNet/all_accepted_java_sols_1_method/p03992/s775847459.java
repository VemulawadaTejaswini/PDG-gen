
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	String str=sc.next();
	
	String f=str.substring(0,4);
	String l=str.substring(4);
	System.out.println(f.toUpperCase()+" "+l.toUpperCase());
	
    }


 
    
    
}
