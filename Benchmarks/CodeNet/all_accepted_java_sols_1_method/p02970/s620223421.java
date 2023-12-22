import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Main {
      private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
     int n = scanner.nextInt();
      int d = scanner.nextInt();
      int x=2*d+1;int y=0;
      if(n%x==0)
        y=n/x;
      else
        y=n/x+1;
      System.out.print(y);
        

    }
}
