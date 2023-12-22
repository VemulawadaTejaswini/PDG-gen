import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int pay = 0;
    while(n > pay){
      pay +=1000;
    }
    System.out.println(pay - n);
  }
}
