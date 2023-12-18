import java.lang.*;  
import java.io.*;  
import java.util.*;  
  
class Main {
// Driver code
 public static String getAlpha(long num) {

    String result = "";
    while (num > 0) {
      num--; // 1 => a, not 0 => a
      long remainder = num % 26;
      char digit = (char) (remainder + 97);
      result = digit + result;
      num = (num - remainder) / 26;
    }

    return result;
  } 
public static void main (String[] args) 
{ 
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    System.out.println(getAlpha(n));
} 
} 