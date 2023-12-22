import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long one = sc.nextLong();
    long zero = sc.nextLong();
    long minus = sc.nextLong();
    long card = sc.nextLong();
    long sum = 0;
    if(card <= one){
      System.out.println(card);
    }
    else{
      sum += one;
      card -= one;
      if(card > zero){
        card -= zero;
        for(int i = 0;i < card;i++){
          sum--;
        }
      }
      System.out.println(sum);
    }
  }
}