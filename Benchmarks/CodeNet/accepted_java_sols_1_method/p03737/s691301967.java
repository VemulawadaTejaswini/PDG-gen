import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String data = scanner.nextLine();
    String[] array = data.split(" ");
    String output = new String();
    for(int i=0; i<array.length; i++) {
       output += array[i].substring(0,1);
    }
    System.out.println(output.toUpperCase());
  }
}
