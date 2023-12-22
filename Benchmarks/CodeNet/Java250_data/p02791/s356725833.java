import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int cou = 1;
    int n = sc.nextInt();
    int[] p = new int[n];
    for(int i = 0; i < n; i++){
      p[i] = sc.nextInt();
    }
    int min = 999999999;
    for(int i = 1; i < n; i++){
      min = Math.min(min,p[i-1]);
      if(p[i] < min){
        cou++;
      }
    }
    System.out.print(cou);
  }
}
