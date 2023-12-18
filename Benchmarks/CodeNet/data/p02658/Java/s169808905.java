import java.io.*;
import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long a = 1;
    long b = 0l;
    int c = 0;
    for (
      int i = 0;
      i < n;
    ){
      b = scanner.nextLong();
      a = a * b;
      i = i+1;
      if ((a >= 1000000000000000001l)||(a < 0)){
      c = 1;
      };
    };
    if ((c == 1) && (a != 0)){
      a = -1;
    }
    System.out.println(a);
  };
};