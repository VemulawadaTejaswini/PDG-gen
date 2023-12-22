import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String[] a = S.split("");
    int price = 700;
    for(int i = 0; i<3; i++){
      if(a[i].equals("o")){
        price += 100;
      }
    }
    System.out.println(price);
  }
}