import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n , m;
    n = sc.nextInt();
    m = sc.nextInt();
    int[] A = new int[m];
    int i = 0;
    for(i=0 ; i < m ; i++){
      A[i] = sc.nextInt();
    }
    for(i = 0; i < m; i++){
      n = n - A[i];
    }
    if(n < 0){
      System.out.println(-1);
    }else{
      System.out.println(n);
    }
  }
}
