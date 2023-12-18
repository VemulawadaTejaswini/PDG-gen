import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int H = sc.nextInt();
      int M = sc.nextInt();
      
      // 算出
      double degree = getDegree(H, M);
      double result = cosFormula(A, B, degree);
      
      // 出力
      System.out.println(result);
    }
    
    // 時針と分針の間の角を求める関数
    public static double getDegree(int H, int M){
      double degH = 30 * H + 0.5 * M;
      double degM = 6 * M;
      double degHM = 0;
      if(degH <= degM){
        degHM = degM - degH;
      }else{
        degHM = degH - degM;
      }
      if(degHM > 180){
        degHM = 360 - degHM;
      }
      
      return degHM;
    }
    
    // 余弦定理を用いて辺を求める関数
    public static double cosFormula(int A, int B, double degree){
      double hen = Math.sqrt(A*A + B*B - 2*A*B * Math.cos(Math.toRadians(degree)));
      
      return hen;
    }

}