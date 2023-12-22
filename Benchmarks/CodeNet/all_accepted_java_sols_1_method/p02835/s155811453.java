import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner sc = new Scanner(System.in);
      	int result = 0;
      	for (int i = 0; i < 3; i++) result += sc.nextInt();
      	if (result < 22) System.out.println("win");
      	else System.out.println("bust");
        
    }
}