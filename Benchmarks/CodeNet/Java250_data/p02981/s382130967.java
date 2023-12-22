import java.lang.*;
import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int a = input.nextInt();
    int b = input.nextInt();
    
    int na = n * a;
    
    if(na < b) {
      System.out.println(na);
    }
    else {
      System.out.println(b);
    }
    
    return;
  }
}