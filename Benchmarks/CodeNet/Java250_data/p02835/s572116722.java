import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[3];
    int ans = 0;
    for(int i = 0; i < a.length; i++){
      a[i] = Integer.parseInt(sc.next());
      ans = ans + a[i];
    }
    if(21 < ans){
      System.out.println("bust");
    }else{
      System.out.println("win");
    }
  }
}