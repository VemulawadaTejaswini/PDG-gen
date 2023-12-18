import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int[] x = new int[2];

      while(true){

        x[0] = sc.nextInt();
        x[1] = sc.nextInt();

        if( x[0] != 0 || x[1] != 0 ){
          Arrays.sort(x);
          System.out.println( x[0] + " " + x[1] );
        }else{
          break;
        }

      }

    } 
}
