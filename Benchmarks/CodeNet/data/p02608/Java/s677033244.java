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
        int zMax = 2;
        boolean zMaxCreated = false;
        for(int x = 1; x <= zMax; x++){
          for(int y = 1; y <= zMax; y++){
            double value = Math.pow(x,2)+Math.pow(y,2)+Math.pow(1,2)+(x*y)+(y*1)+(1*x);
            if( value > m ){
              if( !zMaxCreated ){
                zMax = 1;
                zMaxCreated = true;
              }
            }else{
              if( value == m ){
                count++;
              }
            }
            for(int z = 2; z < 101; z++){
              value += ((2*z)-1+y+x);
              if( value > m ){
                if( !zMaxCreated ){
                  zMax = z;
                  zMaxCreated = true;
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
