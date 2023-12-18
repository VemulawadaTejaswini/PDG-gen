import java.util.Scanner;
import java.lang.Math;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    long score = 1;
    long deadline = (long)Math.pow(10,18);
    for(int i = 0; i < t; i++){
      score*=scan.nextLong();
      if(score > deadline){
        score = -1;
        break;
      }
    }
    System.out.println(score);
  }
}