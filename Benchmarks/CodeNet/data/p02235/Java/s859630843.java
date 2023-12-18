import java.util.Scanner;

class Main{
  static char[] s1,s2;
  static int[][] arr;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int count = scan.nextInt();
    for(int loop = 0; loop < count; loop++) {
      s1 = scan.next().toCharArray();
      s2 = scan.next().toCharArray();
      arr = new int[s1.length][s2.length];
      for(int i = 0; i < arr.length; i++) for(int j = 0; j < arr[i].length; j++) arr[i][j]=-1;
      System.out.println(calc(0,0));
    }
  }

  public static int calc(int x, int y) {
    if(x==s1.length||y==s2.length)  return 0;
    if(arr[x][y]>=0) return arr[x][y];
    if(s1[x]==s2[y]) {
      arr[x][y] = 1 + calc(x+1,y+1);
      return arr[x][y];
    }else {
      arr[x][y] = Math.max(calc(x,y+1),calc(x+1,y));
      return arr[x][y];
    }
  }
}