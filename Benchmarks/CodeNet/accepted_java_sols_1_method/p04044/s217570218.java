import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int L = Integer.parseInt(sc.next());
    String[] strs = new String[N];
    int i;
    for(i=0;i<N;i++){
      strs[i] = sc.next();
    }
    Arrays.sort(strs);
    StringBuilder sb = new StringBuilder();
    for(i=0;i<N;i++){
      sb.append(strs[i]);
    }
    System.out.print(sb.toString());
    System.out.flush();
  }
}
