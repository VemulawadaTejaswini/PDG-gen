import java.io.*;
import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long a = 1;
    int b = 0;
    for (int i = 0;
        i < n;
        i++){
      b = scanner.nextInt();
      a = a * b;
    };
    if (a >= 1000000000000000000l){
      a = -1;
    };
    System.out.println(a);
  };
};