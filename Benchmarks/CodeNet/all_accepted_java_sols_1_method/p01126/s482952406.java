import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    while(true){
      int n = sc.nextInt();
      int m = sc.nextInt();
      int a = sc.nextInt();
      if(n == 0 && m == 0 && a == 0){
        break;
      }
      int[][] hpq = new int[m][3];
      for(int i = 0; i < m; i++){
        for(int j = 0; j < 3; j++){
          hpq[i][j] = sc.nextInt();
        }
      }
      Arrays.sort(hpq,(aa,bb) -> Integer.compare(aa[0],bb[0]));
      int ans = a;
      for(int i = m-1; i >= 0; i--){
        if(ans == hpq[i][1]){
          ans = hpq[i][2];
        }else if(ans == hpq[i][2]){
          ans = hpq[i][1];
        }
      }
      System.out.println(ans);
    }
  }
}

