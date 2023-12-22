import java.io.*;
import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A  = sc.nextInt(), B = sc.nextInt();
    int opt1 = A + A - 1;
    int opt2 = B + B - 1;
    int opt3 = A + B;
    System.out.println(Math.max(opt1, Math.max(opt2, opt3)));
  }
}
