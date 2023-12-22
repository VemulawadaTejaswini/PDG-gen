import java.util.Scanner;
import java.util.Arrays;


class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();

    int i = 0;
    for(i = 1;H > 1;i++){

      H = H/2;
    }


  /*  double N = 0;
    for(int n = 1;n <= i;n++){
      N += Math.pow(2, i-1)-1;
    }*/

  
  //  System.out.println(N);
    System.out.println((long)(Math.pow(2, i-1)+Math.pow(2, i-1)-1));
  }

}
