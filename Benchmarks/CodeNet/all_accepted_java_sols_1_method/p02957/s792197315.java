import java.io.*;
import java.util.*;

public class Main {
 	public static void main(String[] args) throws Exception {
     	Scanner sc = new Scanner(System.in);
      	PrintWriter out = new PrintWriter(System.out);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	if ((a + b) % 2 == 0) {
         	out.println((a+b) / 2); 
        }
      	else {
         	out.println("IMPOSSIBLE"); 
        }
      	out.close();
    }
}