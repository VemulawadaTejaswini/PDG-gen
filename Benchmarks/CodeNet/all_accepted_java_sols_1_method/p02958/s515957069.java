import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar = new int[n];
    int count =0;
    for(int i=0;i<n;i++){
      ar[i] = sc.nextInt();
    }
    for(int j=0;j<n;j++){
      if(ar[j] != j+1){
        count++;
      }
    }
    if(count == 2 || count == 0){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}