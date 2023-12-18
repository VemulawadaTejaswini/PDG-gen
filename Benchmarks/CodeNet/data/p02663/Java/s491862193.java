import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
    int H1= sr.nextInt();
    int M1= sr.nextInt();
    int H2= sr.nextInt();
    int M2= sr.nextInt();
    int K= sr.nextInt();
    System.out.println((H2*60+M2)-(H1*60+M1)-K);
  }
}