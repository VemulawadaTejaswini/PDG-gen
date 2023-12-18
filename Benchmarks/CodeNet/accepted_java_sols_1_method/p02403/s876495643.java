import java.util.Scanner;

public  class Main{

  public static void main(String[] args) {

    try ( Scanner sin = new Scanner(System.in) ){

      StringBuilder str = new StringBuilder();
      int h = sin.nextInt();
      int w = sin.nextInt();

      while(true){
        if( h == 0 )
          if( w == 0 )
            break;

        for( int j = 1; j <= w; j++)
          str.append("#");
        for( int i = 1; i <= h; i++)
          System.out.println(str);
        System.out.println();

        str.setLength(0);
        h = sin.nextInt();
        w = sin.nextInt();
      }
    }
  }
}
