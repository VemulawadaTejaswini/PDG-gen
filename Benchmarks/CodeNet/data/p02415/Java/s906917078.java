import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    char[] newLine = new char[line.length()];

    for (int i = 0; i < line.length(); i++) {
      char c = line.charAt(i);
      if (Character.isUpperCase(c))
        newLine[i] = (Character.toLowerCase(c));
      else if (Character.isLowerCase(c))
        newLine[i] = (Character.toUpperCase(c));
      else
        newLine[i] = c;
    }
    System.out.println(new String(newLine));
  }
}

