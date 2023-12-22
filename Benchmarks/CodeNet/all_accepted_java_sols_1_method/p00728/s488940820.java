import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      while(true){
        int n = sc.nextInt();
        if(n==0) break;
        int max=0,min=1000;
        int[] score = new int[n];

        int avg = 0;
        for(int i=0;i<n;i++){
          score[i] = sc.nextInt();
          if(score[i]>max) max=score[i];
          if(score[i]<min) min=score[i];
          avg += score[i];
        }
        avg = avg - (max + min);
        avg /= (n - 2);
        System.out.println(avg);
      }
    }
  }
}

