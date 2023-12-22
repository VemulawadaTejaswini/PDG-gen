import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int d = stdIn.nextInt();
    int[][] x = new int[n][d];
    for(int i = 0;i<x.length;i++) {
      for(int j = 0;j<x[i].length;j++) {
        x[i][j] = stdIn.nextInt();
      }
    }
    int a = 0;
    int count = 0;
    for(int i = 0;i<x.length;i++) {
      for(int u = i+1;u<x.length;u++) {
        a = 0;
      for(int j = 0;j<x[i].length;j++) {
        if(u<n) a += (int)Math.pow(x[i][j]-x[u][j],2);
        else break;
      }
      //System.out.println(a);
      if(hantei(a)) count+=1;
      }
    }
    System.out.println(count);
  }
  public static boolean hantei(int a) {
    for(int i = 1;i<=(int)Math.sqrt(a);i++) {
      if(a==i*i) return true;
    }
    return false;
  }
  }