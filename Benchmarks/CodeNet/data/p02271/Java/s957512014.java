import java.io.*;
import java.util.*;
class Main{
  static int input_n[];
  // static int input_q[];
  static int n;
  public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    // ArrayList<Integer> input = new ArrayList<Integer>();

    input_n= new int[n];
    StringTokenizer token = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++) {
      input_n[i] = Integer.parseInt(token.nextToken());
    }

    int q = Integer.parseInt(br.readLine());
    //input_q = new int[q];
    token = new StringTokenizer(br.readLine());
    for(int i = 0; i<q; i++) {
      // input_q[i] = Integer.parseInt(token.nextToken());
      if(true==solve(0, Integer.parseInt(token.nextToken()))) System.out.println("yes");
      else System.out.println("no");
    }
  }
  static boolean solve(int i, int m){
    boolean res;
    if(m == 0)return true;
    if(i>=n)return false;
    res = solve(i+1 , m) || solve(i+1, m-input_n[i]);
    return res;
  }
}
