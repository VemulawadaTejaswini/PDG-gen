import java.io.*;
import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long a = 1;
    long b = 0;
    for (
      int i = 0;
      i < n;
    ){
      b = scanner.nextInt();
      a = a * b;
      i = i+1;
    };
    if (a >= 1000000000000000000l){
      a = -1;
    };
    System.out.println(a);
  };
};