import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();


    // 宿題をやる総日数
    int n_sum = 0;
    for(int i=0; i<m; ++i) {
      n_sum += sc.nextInt();
    }

    // 遊べる日数
    int asobitai = -1;
    if(n >= n_sum) {
      asobitai = n - n_sum;
    }

    // 出力
    System.out.println(asobitai);
  }
}