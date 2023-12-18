import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
    	Scanner sc = new Scanner(System.in);
    	while( sc.hasNext() ){
    		String[] line = sc.next().split(" ");
    		int a = Integer.parseInt(line[0]);
    		int b = Integer.parseInt(line[1]);
    		System.out.print(a * b + " " + (a + b) * 2);
    	}    
    }
}