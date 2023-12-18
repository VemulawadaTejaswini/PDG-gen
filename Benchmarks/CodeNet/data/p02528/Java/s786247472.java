import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num[] = new int[n];
    int a;

    num[0] = sc.nextInt();
    for(int i = 1; i < n; i ++){
      a = sc.nextInt();
      for(int j = 0; j < i; j++){
        if(a < num[j]){
          for(int k = i; k > 0; k--){
            num[k] = num[k-1];
          }
          num[0] = a;
          break;
        }else{
          num[i] = a;
        }
      }
    }

    for(int i = 0; i < n; i++){
      System.out.print(num[i]);
      if(i < n-1){
        System.out.print(" ");
      }
    }
    System.out.println();
  }
}