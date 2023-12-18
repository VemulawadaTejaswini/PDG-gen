import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int n = sc.nextInt();

    //output
    int[] array = new int[n];
    for(int x = 1; x*x <= n; x++){
      for(int y = 1; y*y <= n; y++){
        for(int z = 1; z*z <= n; z++){
          int value = (x*x)+(y*y)+(z*z)+(x*y)+(y*z)+(z*x);
          if( value <= n ){
            array[value-1]++;
          }
        }
      }
    }

    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }

  }

}
