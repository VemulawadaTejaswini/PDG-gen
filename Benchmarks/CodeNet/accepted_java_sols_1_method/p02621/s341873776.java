import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    PrintWriter out = new PrintWriter(System.out);
    out.print((int)(A + Math.pow(A,2)+ Math.pow(A,3)));
    out.flush();
  }
}