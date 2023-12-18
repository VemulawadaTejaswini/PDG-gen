import java.io.*;
import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long a = 1;
    long b = 0l;
    for (
      int i = 0;
      i < n;
    ){
      b = scanner.nextLong();
      a = a * b;
      i = i+1;
      if ((a >= 1000000000000000000l)||(a < 0)){
      a = -1;
        break;
    };
    };
    System.out.println(a);
  };
};