import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();
    in.nextLine();
    String S = in.nextLine();
    
    long R = 0, G= 0, B = 0;
    long total = 0;
    int sum = 0;
    
    for(int i = 0; i < N; i++) {
        if(S.charAt(i) == 'R') R++;
        else if(S.charAt(i) == 'G') G++;
        else B++;
    }
    
    total = R*G*B;
    
    for(int i = 0; i < N; i++) {
        for(int j = i+1; j < N; j++) {
            int k = 2*j - i;
            
            if(k < N &&  S.charAt(k) != S.charAt(i) && S.charAt(i) != S.charAt(j) && S.charAt(k) != S.charAt(j)) {
                total--;
            }
        }
    }
    
    System.out.println(total);
  }
  
}