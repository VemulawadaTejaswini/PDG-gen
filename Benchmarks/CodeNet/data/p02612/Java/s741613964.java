import java.util.*;
 
class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if (N<=1000){
      System.out.println(1000-N);
    }else{
      System.out.println(1000-N%1000);
    }
  }
}