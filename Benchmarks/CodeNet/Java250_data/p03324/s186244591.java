import java.util.Scanner;

public class Main{
  static int warizan(int p){
    int n = p;
    int c = 0;//カウント
    while(true){
      n = n/100;
      if(n==0){
        break;
      }
      c += 1;
    }
    if(p%Math.pow(100,c)==0){
      return c;
    }else{
      return -1;
    }

  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int i=0;

    i = (int)Math.pow(100,n) * (m+m/100);
    System.out.println(i);
  }
}