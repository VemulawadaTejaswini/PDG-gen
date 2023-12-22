import java.util.*;

public class Main {
 public static void main(String[] args) {
   // read the data from input files
   Scanner sc = new Scanner(System.in);
   
   // Define variables
   int a = sc.nextInt();
   int b = sc.nextInt();
   
   // if (a - k >= 0 && b - k >= 0) || (a - k < 0 && b - k < 0)
   // => a = b
   // No answers
   
   // if (a - k >= 0 && b - k < 0) || (a - k < 0 && b - k >= 0)
   // => a - k = -b + k
   // => 2k = a + b
   // => k = (a + b) / 2
   // => k must be an integer, so if a + b is an odd number, k gets to be IMPOSSIBLE
   if ( (a + b) % 2 == 0 ) {
     int kInt = (a + b) / 2;
     System.out.println(kInt);
   } else {
     String kStr = "IMPOSSIBLE";
     System.out.println(kStr);
   }
 }
}