import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
		String[] str = scan.nextLine().split(" ");
		int[] x = new int[str.length];
		
        for(int i = 0; i < str.length; i++){
            x[i] = Integer.parseInt(str[i]);
        }
        
        out.println((x[0] * (x[0] - 1) / 2) + (x[1] * (x[1] - 1) / 2));
        
        out.close();
        
    }
}