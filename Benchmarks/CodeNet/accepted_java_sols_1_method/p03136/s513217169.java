/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L[] = new int[N];
    for(int i = 0; i<N; i++){
      L[i] = sc.nextInt(); 
    }
    Arrays.sort(L);
    int S = 0;
    for(int i = 0; i<N-1; i++){
       S += L[i];
    }
    if(L[N-1] >= S){
      System.out.println("No"); 
    }
    else{
      System.out.println("Yes");
    }
  }
}



































