import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] ab1 = new int[n+1];
    int[] ab2 = new int[n+1];
    for(int i = 0; i<m; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(a == 1){
        ab1[b] = 1;
      }else if(b == n){
        ab2[a] = 1;
      }
    }

    for(int i = 1; i<n+1; i++){
      if((ab1[i] == 1)&&(ab2[i] == 1)){
        System.out.println("POSSIBLE");
        return;
      }
    }
    System.out.println("IMPOSSIBLE");
  }
}
