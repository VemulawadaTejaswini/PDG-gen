import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
        Scanner scan = new Scanner(System.in);
        int str = scan.nextInt();
 
      int input=str+2;
      
      int output=0;
      
      if(input%2==0){
        output=1;
      }
      
        System.out.println(output);
        scan.close();
	}
}