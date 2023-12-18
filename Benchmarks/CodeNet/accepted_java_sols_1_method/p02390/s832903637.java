import java.util.Scanner;
import java.lang.Math;

public class Main{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    int remainder = input%3600;
    int hour = input/3600;
    int minute = remainder/60;
    int seconds = remainder % 60;

    System.out.println(Math.round(hour)+ ":" + Math.round(minute) + ":" + Math.round(seconds));
  }
}

