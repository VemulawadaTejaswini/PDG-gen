import java.util.Scanner;
import java.util.Vector;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] sequence = new int[n];
    for(int i = 0; i < n; i++){
      sequence[i] = sc.nextInt();
    }
    int koike = 1;
    int tanaka = 0;
    int min = sequence[0];
    for(int i = 0; i < n; i++){
      if(min >= sequence[i]){
        tanaka++;
      }
      min = Math.min(min,sequence[i]);
    }
    System.out.println(tanaka);
  }
}