import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int a[] = new int[m];
    int sum = 0;
    for(int i = 0; i<m; i++){
      a[i] = scan.nextInt();
    }
    for(int i = 0; i<m; i++){
      sum += a[i];
    }
    if(sum <= n){
      System.out.println(n - sum);
    }else{
      System.out.println(-1);
    }
  }
}
