import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
  	Scanner sc = new Scanner(System.in);
    float d = sc.nextInt();
    float t = sc.nextInt();
    float s = sc.nextInt();
    
    float sdash = d/t;

    if (sdash > s)
        System.out.println("No");
    else
        System.out.println("Yes");
  }

}