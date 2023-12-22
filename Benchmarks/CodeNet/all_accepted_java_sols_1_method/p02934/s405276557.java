import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    double[] numbers = new double[n];
    double sum = 0;
      for(int i = 0; i<n; i++){
        numbers[i] = 1.0/stdIn.nextInt();
        sum += numbers[i];
      }
    System.out.println(1/sum);
    stdIn.close();
  }
}

