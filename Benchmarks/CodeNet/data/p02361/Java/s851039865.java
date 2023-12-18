import java.util.*;

public class MainC {
  final static int INF = 99999999;
  static int[][] adjArr;
  static int v;
  static int[] shortDist;

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    v = scan.nextInt();
    int e = scan.nextInt();
    int s = scan.nextInt();

    adjArr = new int[v][v];
    shortDist = new int[v];
    Arrays.fill(shortDist, INF);
    for(int[] i : adjArr) {
      Arrays.fill(i, INF);
    }

    int start;
    int end;
    int weight;
    for(int i = 0 ; i < e; i++) {
      start = scan.nextInt();
      end = scan.nextInt();
      weight = scan.nextInt();
      adjArr[start][end] = weight;
    }

    bellman(s);

    for(int i = 0 ; i < v ; i++) {
      System.out.println(shortDist[i]);
    }
  }

  static void bellman(int s) {
    shortDist[s] = 0;
    for(int i = 0 ; i < v ; i++) {
      for(int j = 0 ; j < v ; j++) {
        for(int k = 0 ; k < v ; k++) {
          if(j == k) continue;
          int wei = adjArr[j][k];
          if(shortDist[j] != INF && shortDist[k] > shortDist[j] + wei) {
            shortDist[k] = shortDist[j] + wei;
            if(i == v-1) {
              return;
            }
          }
        }
      }
    }
  }
}
