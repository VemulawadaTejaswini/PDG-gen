import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] delicious = new int[n];
    int s = 0;
    int ss = 0;
    for(int i = 0; i < n; i++){
      delicious[i] = sc.nextInt();
      s += delicious[i];
      ss += delicious[i] * delicious[i];
    }
    System.out.println((s * s - ss) / 2);
  }
}