import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int width = input.nextInt();
    int height = input.nextInt();
    int area = width * height;
    int length = width * 2 + height * 2;
    System.out.println(area+" "+length);

  }
}