import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar = new int[100];
    for(int i=0;i < n;i++){
      ar[n-i-1] = sc.nextInt();
    }
    for(int i = 0;i < n;i++){
      System.out.print(ar[i]);
      if(i != n-1){
        System.out.print(" ");
      }
    }
    System.out.println("");
    sc.close();
  }
}

