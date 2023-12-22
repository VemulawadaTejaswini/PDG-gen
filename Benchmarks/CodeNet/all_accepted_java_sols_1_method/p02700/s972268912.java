import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    
    int X = (B+C-1)/B;
    int Y = (A+D-1)/D;
    System.out.println(X<=Y ? "Yes" : "No");
  }
}