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
      double ave,var;
      ave = sum / n;
      for(int j=0;j<score.length;j++){
        var += Math.pow(score[j] - ave,2);
      }
      var /= n;
      System.out.println(Math.sqrt(var));
    }
  }
}