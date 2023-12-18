import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    int n = cin.nextInt(); // n <- データセットの数

    for(int dataSet = 1; dataSet <= n; dataSet++) {
      int y = cin.nextInt(), m = cin.nextInt(), d = cin.nextInt();
      int answer = 0;
      while(true) {
        if(y == 1000 && m == 1 && d == 1) {
          break;
        } 
        int months; // 月の日数
        if(y % 3 == 0 ||  // 3の倍数の月
           m % 2 == 1 ) { // または、奇数月
          months = 20;
        } else {
          months = 19;
        }
        if(d == months) {
          // 月の最後なら次の月へ
          m++; d = 1;
        }else {
          d++; // 次の日へ
        }
        if(m == 11) { // 年の最後なら、次の年へ
          y++; m = 1; d = 1;
        }
        answer++;
      }
      System.out.println(answer);
    }
  }
}