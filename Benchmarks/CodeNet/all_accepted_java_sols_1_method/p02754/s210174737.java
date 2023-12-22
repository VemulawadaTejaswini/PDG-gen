import java.util.Scanner;
import java.util.Arrays;
class Main{
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 
long N = scan.nextLong();
long A = scan.nextLong();
long B = scan.nextLong(); 
long amari = 0;
long blue = 0;
long a = N / (A + B);
 amari = N % (A + B);
  if(amari > A){
    blue = A * (a + 1);
  }
  else {
    blue = amari + (A * a);
  }
  System.out.println(blue);
 }
}