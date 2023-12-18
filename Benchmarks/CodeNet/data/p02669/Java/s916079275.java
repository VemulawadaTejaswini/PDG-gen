import java.util.Scanner;

public class Main{
  long n,x,ans;
  int a,b,c,d;
  
  public static void main(String[] args){
    Main m = new Main();
    m.tast();
  }
  
  public void tast(){
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());
    for(int i = 0 ; i < t ; i++){
      calcMain(sc);
    }
  }
  
  public void calcMain(Scanner sc){
  	String[] lines = sc.nextLine().split(" ");
    n = Long.parseLong(lines[0]);
    a = Integer.parseInt(lines[1]);
    b = Integer.parseInt(lines[2]);
    c = Integer.parseInt(lines[3]);
    d = Integer.parseInt(lines[4]);
    x = 0;
    ans = d;
    double aa = 2.0 / a;
    double bb = 3.0 / b;
    double cc = 5.0 / c;
    if (aa > bb && aa > cc) {
		while (x != n){
          a();
        }
    } else if (bb > cc) {
      while (x != n){
        b();
      }
    } else {
      while (x != n){
        c();
      }
    }
    System.out.println(ans);
  }
  public void a(){
    if (x*2 <= n){
		calcA();
     } else if (x*2-n < n-x){
         calcA();
         for (int i = 0 ; i < x-n ; i++ ){
            calcD('-');
         }
     } else {
         for (int i = 0 ; i < n-x ; i++ ){
            calcD('+');
         }
     }
  }
  public void b(){
    if (x*3 < n) {
          calcB();
    } else {
      if (n-x < Math.abs(n-x*2) && n-x < x*3-n){
          for (int i = 0 ; i < n-x ; i++){
            calcD('+');
          }
      } else if (x*3-n < Math.abs(n-x*2)) {
           calcB();
        for (int i = 0 ; i < x-n ; i++){
           calcD('-');
        }
      } else {
        a();
      }//if文
    }
  }
  public void c(){
    if (x*5 < n) {
          calcC();
    } else {
      if (n-x < Math.abs(n-x*3) && n-x < Math.abs(n-x*2) && n-x < x*5-n){
          for (int i = 0 ; i < n-x ; i++){
            calcD('+');
          }
         } else if (x*5-n < Math.abs(n-x*3) && x*5-n < Math.abs(n-x*2)) {
           calcB();
        for (int i = 0 ; i < x-n ; i++){
           calcD('-');
        }
      } else if (Math.abs(n-x*3) < Math.abs(n-x*2)) {
        b();
      } else {
        a();
      }
    }
  }
  public void calcA(){
    x *= 2;
    ans += a;
  }
  public void calcB(){
    x *= 3;
    ans += b;
  }
  public void calcC(){
    x *= 5;
    ans += c;
  }
  public void calcD(char ch){
    if (ch == '+'){
      x++;
      ans += d;
    } else if (ch == '-') {
      x--;
      ans += d;
    }
  }
}