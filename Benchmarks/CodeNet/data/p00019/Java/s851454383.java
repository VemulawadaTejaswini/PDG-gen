import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  while (in.hasNext())
	System.out.println(f(in.nextInt()));
}

static long f(long v) {
  return (v == 1) ? 1 : f(v - 1) * v;
}
}