import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String data = scanner.nextLine();
    String[] array = data.split(" ");

    char[] chars = new char[3];

    for(int i=0; i<array.length; i++) {
        chars[i] += array[i].charAt(0);
    }
    String output = new String(chars);
    System.out.println(output.toUpperCase());
  }
}
