import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int w, h, x, y, r;
      w = sc.nextInt();
      h = sc.nextInt();
      x = sc.nextInt();
      y = sc.nextInt();
      r = sc.nextInt();

    boolean X, Y;

      if( r<=x && x<=w-r){
        X = true;
      }else{
        X = false;
      }

      if( r<=y && y<=h-r){
        Y = true;
      }else{
        Y = false;
      }

        if( X && Y ){
          System.out.println( "Yes" );
        }else{
          System.out.println( "No" );
        }

    } 
}
