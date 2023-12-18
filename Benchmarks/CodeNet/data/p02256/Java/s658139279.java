import java.util.*;
class Main {
  public static void main(String args[]){
  //input
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    //output
        System.out.println(gcd(a,b));
  }
  //判定
  static int gcd(int x, int y){
    int tmp;
    if(x<y){
      tmp = x;
      y = tmp;
      x = y;
    }
    while(y>0){
      tmp = x%y;
      x = y;
      y = tmp;
    }
    return x;
  }
}
