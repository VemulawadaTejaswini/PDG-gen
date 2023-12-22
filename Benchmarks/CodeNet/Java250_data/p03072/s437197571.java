import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int[] h = new int[n];
    for(int i=0;i<n;i++){
      h[i] = sc.nextInt();
    }
    for(int j=1;j<n;j++){
      int check = 1;
      for(int k=0;k<j;k++){
        if(h[j] < h[k]){
          check = 0;
        }
      }
      if(check == 1){
        count++;
      }
    }
    System.out.println(count+1);
  }
}