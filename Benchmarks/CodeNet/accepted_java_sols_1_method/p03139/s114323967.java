import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
 
    String input1 = scanner.next();
    String input2 = scanner.next();
    String input3 = scanner.next();
 
int N = Integer.parseInt(input1);
int A = Integer.parseInt(input2);
int B = Integer.parseInt(input3);

int max = 0;
int min = 0;

if(A>B){
max = B;
min = A - (N - B);
}else{
max = A;
min = B - (N - A);
}

if(min<0){
min = 0;
}

    System.out.print(max + " " + min);
    scanner.close();
  }
}