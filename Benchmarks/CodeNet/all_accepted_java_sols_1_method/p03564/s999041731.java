import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int K = sc.nextInt();
  int A = 1;
  int B = 0;
  while(A <= K){
    A *= 2;
    B += 1;
  }
  if(N > B) {
  System.out.println((int)Math.pow(2,B) + K*(N-B));
  }
  else if(N <= B)System.out.println((int)Math.pow(2,N));
}
}