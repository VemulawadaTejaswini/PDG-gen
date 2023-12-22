import java.util.Scanner;
import java.lang.Math;
public class Main{
  public static void main(String[] args){
	Scanner a = new Scanner(System.in);
    long x = a.nextLong();
    long y = a.nextLong();
    long z = x%y;
    System.out.println(Math.min(z,Math.abs(y-z)));
  }
}