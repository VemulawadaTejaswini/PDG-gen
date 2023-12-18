import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int c500 = N/500;
    int zan = N%500;
    int c5 = zan/5;
    System.out.println(c500*1000+ c5*5);   
    return;
  }
}

