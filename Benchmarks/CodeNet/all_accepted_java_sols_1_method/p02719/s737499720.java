import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long n = sc.nextLong();
    Long k = sc.nextLong();
    
    long min = n % k;
    if(min < Math.abs(min - k)){
      System.out.println(min);
    }else{
      System.out.println(Math.abs(min - k));
    }
  }
}