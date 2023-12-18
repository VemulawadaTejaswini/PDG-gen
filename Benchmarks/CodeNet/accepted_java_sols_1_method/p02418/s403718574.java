//import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{ 
    	InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
    	   	                                                 
    	String s = reader.readLine();
        String p = reader.readLine();        
        s = s + s;

        if(s.indexOf(p) != -1){
        System.out.println("Yes");
        }      
        else{
        System.out.println("No");
        }
    }
}