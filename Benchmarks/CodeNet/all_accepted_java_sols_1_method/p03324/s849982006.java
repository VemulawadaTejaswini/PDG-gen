import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();
      String[] hedderInfo = line.split("\\s+");
      
      sc.close();
      
      int present = 100;                         // プレゼント対象整数
      int answer = 1;                            // 出力する数
      int D = Integer.parseInt(hedderInfo[0]);   // 割る回数
      int N = Integer.parseInt(hedderInfo[1]);   // 掛ける回数
      
      for (int i = 0; i < D; i++) {
        answer = answer * present;
      }
      
      if (N == present) {
        N = N + 1;
      }

      System.out.println(answer * N);
    }

}
