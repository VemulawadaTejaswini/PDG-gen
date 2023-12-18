import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    long k = sc.nextLong();

    long[] nBooks = new long[n];
    long[] mBooks = new long[m];
    for (int i = 0; i < n; i++) {
      nBooks[i] = sc.nextLong();
    }
    for (int i = 0; i < m; i++) {
      mBooks[i] = sc.nextLong();
    }

    long ret = 0;
    int nCounter = 0;
    int mCounter = 0;
    long currentMinutes = 0;
    for (int i = 0; i < n + m; i++) {
      // どちらの机からも取れる状態
      if (nCounter < n && mCounter < m) {
        // Nの机の一番上にある本がMの机の一番上にある本よりも読む時間が短く、
        // かつNの机の一番上にある本の読む時間を今まで選んだ本の読む時間の総数に足してもKを超えない
        if ((nBooks[nCounter] <= mBooks[mCounter]) && (nBooks[nCounter] + currentMinutes <= k)) {
          currentMinutes += nBooks[nCounter];
          nCounter++;
          ret++;
        } else {
          // Mの机の一番上にある本がNの机の一番上にある本よりも読む時間が短いのは分かっているが、
          // Mの机の一番上にある本の読む時間を今まで選んだ本の読む時間の総数に足してもKを超えないかどうか
          if (mBooks[mCounter] + currentMinutes <= k) {
            currentMinutes += mBooks[mCounter];
            mCounter++;
            ret++;
          }
        }
      } else if (mCounter < m) {
        // Nの机の本を読み尽くしたのでMの机から取れるかどうかを確認する
        if (mBooks[mCounter] + currentMinutes <= k) {
          currentMinutes += mBooks[mCounter];
          mCounter++;
          ret++;
        }
      } else if (nCounter < n) {
        // Mの机の本を読み尽くしたのでNの机から取れるかどうかを確認する
        if (nBooks[nCounter] + currentMinutes <= k) {
          currentMinutes += nBooks[nCounter];
          nCounter++;
          ret++;
        }
      }
    }
    System.out.println(ret);
  }
}
