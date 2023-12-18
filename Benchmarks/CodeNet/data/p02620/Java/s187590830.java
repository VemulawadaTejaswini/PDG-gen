import java.util.HashMap;
import java.util.Scanner;

public class Main {
  static int d;
  static int[] array_c;
  static int[][] array_s;


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    d = sc.nextInt();
    array_c = new int[27];
    array_s = new int[d + 1][27];
    int[] schedule = new int[d + 1];

    for(int i = 1; i <= 26; i++){
      array_c[i] = sc.nextInt();
    }
    for(int i = 1; i <=d; i++){
      for(int j = 1; j <= 26; j++){
        array_s[i][j] = sc.nextInt();
      }
    }
    for(int i = 1; i <= d; i++){
      schedule[i] = sc.nextInt();
    }

    int m = sc.nextInt();
    for(int i = 0; i < m; i++){
      int d = sc.nextInt();
      int q = sc.nextInt();
      schedule[d] = q;
      System.out.println(calcScore(schedule));
    }
  }

  static int calcScore(int[] schedule){
    int m = 0;
    HashMap<Integer, Integer> last = new HashMap<>();
    for(int i = 1; i <= d; i++){
      last.put(schedule[i], i);
      m += array_s[i][schedule[i]];
      for(int j = 1; j <= 26; j++){
        int lastday = last.get(j) == null ? 0 : last.get(j);
        m -= (i - lastday) * array_c[j];
      }
    }
    return m;
  }
}