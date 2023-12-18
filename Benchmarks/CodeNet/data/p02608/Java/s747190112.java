import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int n = sc.nextInt();

    //output
    for(int m = 1; m <= n; m++){
      if( m < 6 ){
        System.out.println(0);
      }else{
        int count = 0;
        int zMax = 1;
        boolean zMaxCreated = false;
        for(int x = 1; x < 101; x++){
          for(int y = 1; y < 101; y++){
            for(int z = 1; z < 101; z++){
              double value = Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)+(x*y)+(y*z)+(z*x);
              if( value > m ){
                if( !zMaxCreated ){
                  zMax = z;
                }
                break;
              }else{
                if( value == m ){
                  count++;
                }
              }
            }
          }
        }
        System.out.println(count);
      }
    }
  }
}
