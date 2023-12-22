import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String n = scanner.nextLine();
    String[] h = scanner.nextLine().split(" ");
    
    int max = Integer.parseInt(h[0]);
    int lookAble = 1;
    
    for(int i = 1; i < Integer.parseInt(n); i++) {
      if(max <= Integer.parseInt(h[i])) {
        lookAble ++;
        max = Integer.parseInt(h[i]);
      }
    }
 
    System.out.print(lookAble);
  }
}