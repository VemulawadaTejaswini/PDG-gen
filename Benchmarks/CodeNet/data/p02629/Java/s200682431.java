import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final long n = scanner.nextLong();
    final String s = Long.toString(n, 26);

    final String s2 = s.replace("o", "y")
        .replace("n", "x")
        .replace("m", "w")
        .replace("l", "v")
        .replace("k", "u")
        .replace("j", "t")
        .replace("i", "s")
        .replace("h", "r")
        .replace("g", "q")
        .replace("f", "p")
        .replace("e", "o")
        .replace("d", "m")
        .replace("c", "l")
        .replace("b", "k")
        .replace("a", "j")
        .replace("9", "i")
        .replace("8", "h")
        .replace("7", "g")
        .replace("6", "f")
        .replace("5", "e")
        .replace("4", "d")
        .replace("3", "c")
        .replace("2", "b")
        .replace("1", "a")
        .replace("0", "z");

    System.out.println(s2);
  }
}
