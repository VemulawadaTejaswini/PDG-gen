import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int v = sc.nextInt();
    int b = sc.nextInt();
    int w = sc.nextInt();
    int t = sc.nextInt();
    //もともとの差
    long sa = Math.abs(a-b);
    //詰められる距離
    long kyori = (v-w)*t;
	//差より詰めたら捕まえられる
    if(sa <= kyori){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

  }
}