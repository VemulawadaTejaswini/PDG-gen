import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    long k = 0;
    int max = -1000001;
    int min = 1000001;
      for ( int i = 1 ; i <= a ; i++){
        int b = sc.nextInt();
        if ( b > max ){
          max = b;
        }
        if ( b < min ){
          min = b;
        }
        k = k + b;
      }
      System.out.println(min + " " + max + " " + k);
  }
}

