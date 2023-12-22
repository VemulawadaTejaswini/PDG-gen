// a program which finds the number of prime numbers in the given list

import java.util.*;
import java.lang.*;

class Main{

  public static void main(String[] args){
    final int N;
    int A, num = 0;           // num : the number of prime numbers in the given list

    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();

    for( int i = 0; i<N; i++ ){
      A = scanner.nextInt();
      num += isPrime(A);
    }

    scanner.close();
    System.out.println(num);
  }

  // a function for judging whether the given number is a prime number or not
  // Returned Value 0: not prime number 1: prime number
  static int isPrime(int n){

    for( int i = 2; i<=Math.sqrt(n); i++ ){
      if( n % i == 0 )
        return 0;
    }

    return 1;
  }// the end of the method: "isPrime"

}// the end of the class: "Main"

