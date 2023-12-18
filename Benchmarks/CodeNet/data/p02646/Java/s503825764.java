import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int v = sc.nextInt();
    int b = sc.nextInt();
    int w = sc.nextInt();
    int t = sc.nextInt();
    int x = v-w;
    long c = a-b;
    long z = x*t;
    if(c<0){
      long d;
      d = c;
      c = -d;
    }
    if(x<=0){
      System.out.println("NO");
    }else if(z >=c){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}