import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long v = sc.nextInt();
    long b = sc.nextInt();
    long w = sc.nextInt();
    long t = sc.nextInt();
    //もともとの差
    long sa = Math.abs(a-b);
    //詰められる距離
    long kyori = v-w;
	//差より詰めたら捕まえられる
    if(kyori*t>=sa){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

  }
}