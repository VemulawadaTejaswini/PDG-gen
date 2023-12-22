import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();
    int l = scanner.nextInt();
    
    ArrayList<String> word = new ArrayList<>();
    
    // n回データを取得し格納する
    for(int i = 0; i < n; i++) {
      word.add(scanner.next());
    }
    
    // 自然順序（Stringであれば辞書順）にソート
    word.sort(Comparator.naturalOrder());
    
    // listの中の要素を区切らずに連続して出力
    for(String w: word) {
      System.out.print(w);
    }
  }
}
