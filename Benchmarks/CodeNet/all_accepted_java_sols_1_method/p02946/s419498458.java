import java.util.*;

public class Main{
  public static void main(String[] args){
    int a[] = new int[2000001];
    for(int i = 0; i <= 2000000; i++){
      a[i] = i - 1000000;
    }
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int x = sc.nextInt();
    for(int j = 0; j < 2*k-1; j++){
      System.out.println(a[x-k+j+1000001]);
    }


  }
}