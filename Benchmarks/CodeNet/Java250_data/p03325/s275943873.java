import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.nextLine());   // データの個数
      String line = sc.nextLine();
      String[] dataInfo = line.split("\\s+");
      
      int counter = 0;
      
      for (int i = 0; i < N; i++) {
      
          int tmpNumber = Integer.parseInt(dataInfo[i]);
          // 2で割り切れなくなったら終了
          while (tmpNumber % 2 == 0) {
              tmpNumber = tmpNumber / 2;
              counter++;
          }
      }

      System.out.println(counter);
      sc.close();
    }

}