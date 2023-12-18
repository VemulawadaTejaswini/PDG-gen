import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double sum=0;
    while(true){
      int n = sc.nextInt();
      if(n==0) break;
      double[] score = new double[n];
      for(int i=0;i<score.length;i++){
        score[i] = sc.nextDouble();
        sum += score[i];
      }
      double ave,var=0.0;
      ave = sum / (double)n;
      for(int j=0;j<score.length;j++){
        var += (score[j] - ave)*(score[j] - ave);
      }
      var /= (double)n;
      System.out.printf("%.8f\n",Math.sqrt(var));
    }
  }
}