import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int rate = sc.nextInt();

    String contest;
    if( rate < 1200 ){
      contest = "ABC";
    }else if(rate <  2800){
      contest = "ARC";
    }else {
      contest = "AGC";
    }

    System.out.println(contest);
  }
}
