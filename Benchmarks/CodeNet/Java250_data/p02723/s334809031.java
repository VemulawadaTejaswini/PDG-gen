import java.util.Scanner;

public class Main {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] arr = sc.next().toCharArray();

    System.out.println(arr[2] == arr[3] && arr[4] == arr[5] ? "Yes": "No");
  }
}