import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double sum=0;
    while(true){
      int n = sc.nextInt();
      if(n==0) break;
      int[] score = new int[n];
      for(int i=0;i<score.length;i++){
        score[i] = sc.nextInt();
        sum += score[i];
      }
      double ave,var=0;
      ave = sum / (double)n;
      for(int j=0;j<score.length;j++){
        var += Math.pow(score[j] - ave,2);
      }
      var /= (double)n;
      System.out.printf("%.8f\n",Math.sqrt(var));
    }
  }
}