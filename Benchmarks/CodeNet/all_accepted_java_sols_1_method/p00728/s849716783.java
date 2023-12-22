import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int n = sc.nextInt();
      if(n==0){
        break;
      }
      int sum = 0;
      double ave = 0;
      int ans = 0;
      int[] score=new int[n];
      for(int i=0; i<n;i++){
        score[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
        for(int j=0;j<n-1;j++){
          if(score[j+1]<score[j]){
            int temp = score[j+1];
            score[j+1] = score[j];
            score[j] = temp;
          }
        }
      }
      score[0]=0;
      score[n-1]=0;
      for(int i=0;i<n;i++){
        sum += score[i];
      }
      ave = (double)sum/(n-2);
      ans = (int)ave;
      System.out.println(ans);
    }
  }
}
