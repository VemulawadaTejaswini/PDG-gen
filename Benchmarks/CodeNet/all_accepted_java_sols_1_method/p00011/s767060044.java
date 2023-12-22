import java.util.Scanner;

class Main {
/*
  static int DrawingLots(int j, int i, int[][] ab, int n) {
    for (; j < n; j++) {
      if (ab[j][0] == i) return DrawingLots(j+1, ab[j][1], ab, n);
      else if (ab[j][1] == i) return DrawingLots(j+1, ab[j][0], ab, n);
    }
      return i;
  }
*/
public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int w = stdIn.nextInt(); int[] ans = new int[w];
    int n = stdIn.nextInt(); 

    for (int i = 0; i < w; i++) {
      ans[i] = i+1;
    }
    for (int i = 0; i < n; i++) {
      String tmp = stdIn.next();
     String[] ab = tmp.split(",");
      int a = Integer.parseInt(ab[0]) - 1;
      int b = Integer.parseInt(ab[1]) - 1;
      int tmpnum;
      tmpnum = ans[a];
      ans[a] = ans[b];
      ans[b] = tmpnum;
    }
/*
    for (int i = 1; i < w+1; i++) {
      int j = 0;
      ans[i] = DrawingLots(j, i, ab, n);
    }  
*/
/*
    for (int i = 1; i < w+1; i++) {
    for (int j = 1; j < w+1; j++)
      if (ans[j] == i)
      System.out.println(j);
    }
*/
    for (int i=0; i < w; i++)
    System.out.println(ans[i]);
  }
   
}
