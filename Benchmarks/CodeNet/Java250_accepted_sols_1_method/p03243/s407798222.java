import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res = -1;
    for(int i=999;i>=111;i-=111){
      if( i>=n ){ res = i; }
    }
    System.out.println(res);
  }
}
