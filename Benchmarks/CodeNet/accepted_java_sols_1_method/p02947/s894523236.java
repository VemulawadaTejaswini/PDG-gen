import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    String[] s = new String[N]; 
    String[][] s_ = new String[N][10];

    for (int i = 0; i < N; i++) {
      s[i] = "";
      String str_ = sc.next();
      s_[i] = str_.split("");
      Arrays.sort(s_[i]);
      for (int j = 0; j < 10; j++) {
        s[i] += s_[i][j];
      }
    }

    Arrays.sort(s);

    sc.close(); 

    long count_ = 0;
    long count = 0;
    boolean countStart = false;

    for (int i = 0; i < N-1; i++){
      if (s[i].equals(s[i+1])) {
        if (countStart == false) {
          countStart = true;
          count_ = 1;
        }
        count_++;
      } else {
        if (countStart == true) {
          count += count_ * (count_ - 1) / 2;
          countStart = false;
        }
      }
    }

    if (countStart == true) {
      count += count_ * (count_ - 1) / 2;
    }

    System.out.println(count);
  
  }

}