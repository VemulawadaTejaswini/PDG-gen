import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int aPos = sc.nextInt();
    int aSpeed = sc.nextInt();
    int bPos = sc.nextInt();
    int bSpeed = sc.nextInt();
    int time = sc.nextInt();

    int diffSpeed = aSpeed - bSpeed; //if +, a is faster; if -, b is faster
    int diffPos = Math.abs( aPos - bPos );

    if( diffSpeed <= 0 ){ //if same speed or b is faster
      System.out.println("NO");
    }else{ //if a is faster
      /*
      if( ((double)diffPos / time) <= diffSpeed ){ //compare speeds
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
      */

      if( ((long)diffSpeed * time) >= diffPos ){ //must use long as can reach high value
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }

  }
}
