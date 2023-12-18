import java.util.Scanner;
public class Main {
  public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    int res1000 = -1;
    int res5000 = -1;
    int res10000 = -1;

    for(int a = 0; a<=N; a++){ //aについて0~Nまで調べる
      for(int b =0; b<=N-a; b++){ //bについて0~N-aまで調べる
        int c = N-a-b;             //cは確定する
        if(10000*a+5000*b+1000*c==Y){ //条件に合うか
          res10000 = a;
          res5000 = b;
          res1000 = c;
        }
      }
    }
    System.out.println(res10000+" "+res5000+" "+res1000);



  }
}
