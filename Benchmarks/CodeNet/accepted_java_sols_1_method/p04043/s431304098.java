import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Main {
  public static void main(String[] args) {
    int sevenCounter = 0;
    int fiveCounter = 0;
    
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
//     try {
//            StringTokenizer token = new StringTokenizer(br.readLine());
    
    Scanner sc = new Scanner(System.in);
    
    
    for (int i = 0; i< 3; i++) {
      while (sc.hasNext()) 
      {
        if (sc.nextInt() == 7)
        sevenCounter++;
       else 
        fiveCounter++; 
      }
    }
      
//     } catch (IOException ex) {
      
      
//     }
    
   
    
    if (sevenCounter == 1 && fiveCounter == 2) {
      System.out.println("YES"); 
    } else {
        System.out.println("NO"); 
    }
  }
}
