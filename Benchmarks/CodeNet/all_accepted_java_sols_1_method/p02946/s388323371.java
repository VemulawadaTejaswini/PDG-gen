import java.util.Scanner;
import java.io.PrintWriter;

public class Main { //クラス名はMain
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      PrintWriter out = new PrintWriter(System.out);
      int k = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      String ans = "";
      for(int i = x;i>=-100000 && i>x-k;i--){
        ans = i + " " + ans;
      }
      for(int i = x+1;i<=1000000 && i<x+k;i++){
        ans += (i+" ");
      }
      out.println(ans.substring(0,ans.length()));
      out.flush();
    }
}