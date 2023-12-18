import java.util.Scanner;
import java.lang.Math;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    long score = 1;
    for(int i = 0; i < t; i++){
      score*=scan.nextLong();
      if(score >= Math.pow(10, 18)){
        score = -1;
        break;
      }
    }
    System.out.println(score);
  }
}