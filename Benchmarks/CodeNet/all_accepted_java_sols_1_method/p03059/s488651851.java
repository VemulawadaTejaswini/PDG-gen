import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    double t=sc.nextDouble();

    int start=1;
    int count=0;

    while(t+0.5>=a*start){

      start++;
      count++;
    }

    System.out.println(count*b);

  }
}
