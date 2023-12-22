import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[][] m = new int[3][3];
    String result = "";
    
    for(int i = 0 ; i < 3 ; ++i){
      for(int j = 0 ; j < 3 ; ++j){
        m[i][j] = sc.nextInt();
      }
    }
    //縦比較
    int a = m[0][0] - m[0][1];//1
    int b = m[0][0] - m[0][2];//2
    int c = m[1][0] - m[1][1];//1
    int d = m[1][0] - m[1][2];//2
    int e = m[2][0] - m[2][1];//1
    int f = m[2][0] - m[2][2];//2
    //横比較
    int g = m[0][0] - m[1][0];//1
    int h = m[0][0] - m[2][0];//2
    int i = m[0][1] - m[1][1];//1
    int j = m[0][1] - m[2][1];//2
    int k = m[0][2] - m[1][2];//1
    int l = m[0][2] - m[2][2];//2
    
    //比較する
    boolean ac = a==c;
    boolean ae = a==e;
    boolean ce = c==e;
    boolean ace = ac&&ae&&ce;
    boolean bd = b==d;
    boolean bf = b==f;
    boolean df = d==f;
    boolean bdf = bd&&bf&&df;
    boolean gi = g==i;
    boolean gk = g==k;
    boolean ik = i==k;
    boolean gik = gi&&gk&&ik;
    boolean hj = h==j;
    boolean hl = h==l;
    boolean jl = j==l;
    boolean hjl = hj&&hl&&jl;
    
    if(ace && bdf && gik && hjl){
      result = "Yes";
    }else{
      result = "No";
    }

    System.out.println(result);
    
  }
}

