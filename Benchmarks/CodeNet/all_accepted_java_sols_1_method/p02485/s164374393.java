import java.io.*;
import java.util.Scanner;

class Main {
	public static void main (String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        
        while (true) {
            int sum = 0;
            String str = in.next();
            
            if (str.equals("0"))
                break;
            
            for (int i=0; i<str.length(); i++) {
                sum += str.charAt(i) - '0';
            }
            System.out.println(sum);
        }
	}
}