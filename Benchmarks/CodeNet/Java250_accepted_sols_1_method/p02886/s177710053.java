import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]ar = new int[n];
    int sum = 0;
    for(int i=0;i<n;i++){
      ar[i] = sc.nextInt();
    }
    for(int j=0;j<n-1;j++){
      for(int k=j+1;k<n;k++){
        sum += ar[j]*ar[k];
      }
    }
    System.out.println(sum);
  }
}