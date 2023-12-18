import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int n = sc.nextInt();
      if(n==0)break;
      int[] score = new int[n];
      for(int i=0;i<score.length;i++){
        score[i] = sc.nextInt();
      }
      double ave = 0, var = 0;
      for(int i=0;i<score.length;i++){
        ave += score[i];
      }
      ave /= n;
      for(int j=0;j<score.length;j++){
        var += Math.pow(score[j] - ave,2);
      }
      var /= n;
      System.out.printf("%.8f\n",Math.sqrt(var));
    }
  }
}