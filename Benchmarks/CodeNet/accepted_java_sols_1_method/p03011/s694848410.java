import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();
    int pq = p + q;
    int qr = q + r;
    int rp = r + p;
    
    int result = pq;
    if(qr < result){
      result = qr;
    }
    if(rp < result){
      result = rp;
    }
    // 出力
    System.out.println(result);
  }
}
