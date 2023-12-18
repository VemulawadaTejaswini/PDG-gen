import java.util.*;
import java.lang.*;
import java.io.*;

 public class ABC172A{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int ans = a + a*a + a*a*a;
    System.out.println(ans);
  }
}
