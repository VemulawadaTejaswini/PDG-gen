import java.util.*;

public class Main {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int H = scanner.nextInt();
    int W = scanner.nextInt();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < W + 2; i++) sb.append('#');
    sb.append('\n');
    for (int i = 0; i < H; i++) {
      sb.append('#').append(scanner.next().toCharArray()).append('#').append('\n');
    }
    for (int i = 0; i < W + 2; i++) sb.append('#');
    sb.append('\n');
    System.out.print(sb.toString());
	}
}