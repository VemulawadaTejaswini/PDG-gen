import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    Long price = 100L;
    int year = 0;
    while(price<N){
      price += price/100;
      year++;
    }
    System.out.print(year);
  }
}
