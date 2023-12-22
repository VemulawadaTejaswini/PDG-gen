import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    while(true){
      int n = scan.nextInt();
      int[] score;
      double sum = 0, avg;
      double bunsan = 0;
      if(n==0) break;
      score = new int[n];
      for(int i=0;i<n;i++){
        score[i] = scan.nextInt();
        sum += score[i];
      }
      avg = sum / n;
      for(int i=0;i<n;i++){
        bunsan += (score[i]-avg)*(score[i]-avg);
      }
      bunsan /= (double)n;
      bunsan = Math.sqrt(bunsan);
      System.out.println(bunsan);
    }
  }
}

