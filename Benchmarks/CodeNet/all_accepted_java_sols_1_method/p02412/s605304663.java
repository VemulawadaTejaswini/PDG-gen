import java.util.Scanner;

class Main{
  public static void main(String args[]){
    int i,j,k,n,x,sum;
    Scanner sc = new Scanner(System.in);
    while(true){
      n = sc.nextInt();
      x = sc.nextInt();
      if(n == 0 && x == 0){
        break;
      }
      sum = 0;
      for(i = 1;i <= n - 2;i++){
        for(j = i + 1;j <= n - 1;j++){
          for(k = j + 1;k <= n;k++){
            if(i + j + k == x){
              sum += 1;
            }
          }
        }
      }
      System.out.println(sum);
    }
  }
}