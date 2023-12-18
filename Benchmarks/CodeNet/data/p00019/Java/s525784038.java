import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  System.out.println(f(new Scanner(System.in).nextInt()));
}

static int f(int v) {
  return (v == 1) ? 1 : f(v - 1) * v;
}
}