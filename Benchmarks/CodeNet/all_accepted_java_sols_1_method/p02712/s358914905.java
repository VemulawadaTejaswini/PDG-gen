import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();
    long sum = 0;
    for(int i = 1; i <= N; i++) {
        if(i%5 == 0 && i%3 == 0){
        }
        else if(i%5 == 0) {
        }
        else if(i%3 == 0) {
        }
        else {
            sum += i;
        }
    }
    
    System.out.println(sum);
    
  }
  
  
}