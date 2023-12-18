import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args)throws IOException{
    //BufferedReader br = new BufferedReader(System.in);
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    
    int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a<c && c<b) || (b<c && c<a))
			out.println("Yes");
		else
			out.println("No");
    
    out.flush();
  }
}