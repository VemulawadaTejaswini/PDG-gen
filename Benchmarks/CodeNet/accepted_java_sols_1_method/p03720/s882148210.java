import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int[] r = new int[2*m];
    int[] rr = new int[n+1];

    for(int i = 0; i < 2*m; i++){r[i] = scan.nextInt();}
    //for(int i = 0; i < 2*m; i++){System.out.println(r[i]);}

    for(int i = 0; i < n+1; i++){rr[i] = 0;}

    for(int i = 0; i < 2*m; i++){
      rr[r[i]]++;
    }

    for(int i = 1; i <= n; i++){
      System.out.println(rr[i]);
    }

  }
}
