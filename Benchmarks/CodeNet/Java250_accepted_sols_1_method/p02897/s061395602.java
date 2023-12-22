import java.util.Scanner;

class Main{
  static public void main(String args[]){
    int N;
    double S = 0;
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    S = (N - (N / 2));
    System.out.println(S / N);
  }
}
