import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double dis = sc.nextDouble();
    double min = sc.nextDouble();
    double speed = sc.nextDouble();
    if(dis / speed <= min){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}

    