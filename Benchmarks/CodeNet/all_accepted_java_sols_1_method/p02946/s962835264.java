import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int x = sc.nextInt();
    for (int i=-300;i<300;i++){
      if (Math.abs(i-x) < k){
        System.out.print(i);
        System.out.print(" ");
      }
    }
  }
}