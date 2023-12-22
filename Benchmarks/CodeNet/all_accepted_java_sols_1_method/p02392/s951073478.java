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
        
        if (a < b){
        	if(b < c){
        		System.out.println("Yes");
        	}else{
        		System.out.println("No");
        	}
        }else{
        	System.out.println("No");
        }
		
	}
}