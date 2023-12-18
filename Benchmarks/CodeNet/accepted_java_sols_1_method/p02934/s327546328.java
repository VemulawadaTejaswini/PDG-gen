import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] sequence = new int[n];
    double denominator = 0;
    for(int i = 0; i < n; i++){
      sequence[i] = sc.nextInt();
      denominator += 1.0/sequence[i];
    }
    System.out.println(1/denominator);
  }
}