import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long h = Integer.parseInt(scan.next());
    long w = Integer.parseInt(scan.next());
    long max = (h + 2) / 3 * w;
    long min = h / 3 * w;
    long diff = max - min;
    max = (w + 2) / 3 * h;
    min = w / 3 *  h;
    diff = Math.min(diff, max - min);
    for (int i = 1; i < h; i++) {
      max = Math.max(i * w, (w + 1) / 2 * (h - i));
      min = Math.min(i * w, w / 2 * (h - i));
      diff = Math.min(diff, max - min);
    }
    for (int i = 1; i < w; i++) {
      max = Math.max(i * h, (h + 1) / 2 * (w - i));
      min = Math.min(i * h, h / 2 * (w - i));
      diff = Math.min(diff, max - min);
    }
    System.out.println(diff);
  }
}