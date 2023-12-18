import java.util.Scanner;
class Main{
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 
 long A = scan.nextLong();
 long B = scan.nextLong();
 long N = scan.nextLong();
 long x = B-1;
 double K = 0;
 double L = 0;
 int M = 0;
 int H = 0;
 long Y = 0;
  
 if (N < B-1){
   x = N;
 }
 else{
   x = B-1;
 }
  
  K = (A*x)/B;
  M = (int)K;
  L = x/B;  
  H = (int)L;
  Y = M - (A * H);
 
     System.out.println(Y);
 }
}