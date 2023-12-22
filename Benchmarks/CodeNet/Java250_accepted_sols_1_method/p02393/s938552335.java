import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int a = Integer.parseInt(s);
        s = scan.next();
        int b = Integer.parseInt(s);
        s = scan.next();
        int c = Integer.parseInt(s);
        int  change = 0;
        
        if (a > b){
        	change = a;
        	a = b;
        	b = change;
        }
        
        if (b > c){
        	change = b;
        	b = c;
        	c = change;
        }
        
        if(a > c){
        	change = a;
        	a = c;
        	c = change;
        }
        
        if (a > b){
        	change = a;
        	a = b;
        	b = change;
        } 
        
        System.out.println(a + " " + b + " " + c);
        
	}
}