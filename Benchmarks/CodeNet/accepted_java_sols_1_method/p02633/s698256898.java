import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int angle = sc.nextInt();

    //output
    //least common multiple
    int lcm = 360; //360 is the higher number given range of angle
    while( lcm % angle != 0 ){ //if not divisible, add 360
      lcm += 360;
    }
    System.out.println( lcm/angle );

  }
}
