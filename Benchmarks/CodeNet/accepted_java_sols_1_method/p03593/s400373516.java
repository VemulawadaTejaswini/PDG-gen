import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int[] freq = new int[26];
    for (int i = 0; i < H; i++) {
      char[] line = scanner.next().toCharArray();
      for (int j = 0; j < W; j++) freq[line[j] - 'a']++;
    }

    int cnt4 = (H / 2) * (W / 2);
    int cnt2 = (W % 2) * (H / 2) + (H % 2) * (W / 2);

    for (int i = 0; i < 26; i++) {
      int f = Math.min(cnt4, freq[i] / 4);
      cnt4 -= f;
      freq[i] -= f * 4;
    }
    for (int i = 0; i < 26; i++) {
      int f = Math.min(cnt2, freq[i] / 2);
      cnt2 -= f;
      freq[i] -= f * 2;
    }
    if (cnt2 == 0 && cnt4 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
