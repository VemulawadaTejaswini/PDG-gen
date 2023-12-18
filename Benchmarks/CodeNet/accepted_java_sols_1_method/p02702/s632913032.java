import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 対象の文字列
    String S = sc.next();

    // 文字列の長さ
    int N = S.length();

    // 文字列の長さの配列を作る
    int A[] = new int[2019];
    A[0] =1;
    int dight = 1;
    long ans = 0;
    int tmp = 0;
    for(int i=N-1; i>=0 ;i--){
      int x = Character.getNumericValue(S.charAt(i));
      tmp=((x*dight)+tmp)%2019;
      ans +=A[tmp];
      A[tmp]++;
      dight = dight * 10 % 2019;
    }
    System.out.print(ans);
  }  
  
}


