import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    
    int a = x/500;
    int b = (x%500)/5;
    
    long happy = a*1000 + b*5;

    System.out.println(happy);
    
  }
}