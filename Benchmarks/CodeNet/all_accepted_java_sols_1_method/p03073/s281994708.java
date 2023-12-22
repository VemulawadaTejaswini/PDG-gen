import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] line = scanner.nextLine().split("");
    
    int curr = Integer.parseInt(line[0]);
    int change = 0;
    for(int i = 1; i < line.length; i++) {
      if (curr == Integer.parseInt(line[i])) {
        curr = Integer.parseInt(line[i]) == 0 ? 1 : 0;
        change++;
      }
      else {
        curr = Integer.parseInt(line[i]);
      }
    }
    System.out.println(change);
  }
}