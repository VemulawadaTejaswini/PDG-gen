import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int aPos = sc.nextInt();
    int aSpeed = sc.nextInt();
    int bPos = sc.nextInt();
    int bSpeed = sc.nextInt();
    double time = sc.nextDouble();

    int diffSpeed = aSpeed - bSpeed; //if +, a is faster; if -, b is faster
    int diffPos = Math.abs( aPos - bPos );

    if( diffSpeed <= 0 ){ //if same speed or b is faster
      System.out.println("NO");
    }else{ //if a is faster
      if( (diffPos / time) <= diffSpeed ){ //if change in difference is greater than or equal to intial difference
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }

  }
}
