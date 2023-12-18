import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    StringBuilder sb = new StringBuilder();
    for (; N > 0; N = (N - 1) / 26)
        sb.append((char) ((N - 1) % 26 + 'a'));
    System.out.println(sb.reverse().toString());
  }
}    