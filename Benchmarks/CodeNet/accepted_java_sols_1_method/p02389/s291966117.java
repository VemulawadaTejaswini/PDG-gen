import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author saku
 */
public class Main {
    public static void main(String args[]) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
       String[] div = str.split(" ");
       int s = Integer.parseInt(div[0]);
       int l = Integer.parseInt(div[1]);
       System.out.println(s*l + " " + 2*(s+l));
    }     
}