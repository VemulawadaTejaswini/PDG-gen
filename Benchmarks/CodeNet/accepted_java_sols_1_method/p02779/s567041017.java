import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    boolean flag = true;
    for(int i = 0;i < n;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    for(int j = 1;j < n;j++){
      if(a[j-1] == a[j]) flag = false;
    }
    if(flag){
      System.out.println("YES");
    }else{
      System.out.println("NO");      
    }
  }
}