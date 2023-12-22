import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int q = Integer.parseInt(sc.next());
    String s = sc.next();
    int[] c = new int[n];
    int count = 0;
    for (int i =0;i<n-1;i++){
      if ("AC".equals(s.substring(i,i+2))){
        count++;
      }
      c[i+1] = count;
    }
    int l,r,ans;
    StringBuilder sb = new StringBuilder();
    for (int i = 0;i<q;i++){
      //l = sc.nextInt();
      //r = sc.nextInt();
      l = Integer.parseInt(sc.next());
      r = Integer.parseInt(sc.next());
      ans = c[r-1]-c[l-1];
      //System.out.println(ans);
      sb.append(ans);
      sb.append("\n");
    }
    System.out.println(sb.toString());
    sc.close();
  }
}