import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
    int L = sr.nextInt();
    int R = sr.nextInt();
    int d = sr.nextInt();
    System.out.println(((R-(R%d))/d)-(((L-1)-(L-1)%d)/d));
  
  }

}