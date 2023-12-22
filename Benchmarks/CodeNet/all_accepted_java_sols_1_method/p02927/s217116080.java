import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int m = sc.nextInt();
    int d = sc.nextInt();
    int sum = 0;
    for(int i=4;i<=m;i++){
      for(int j=22;j<=d;j++){
        if((j%10)>=2&&(j%10)*(j/10)==i){
          sum++;
        }
      }
    }
    System.out.println(sum);
  }
}