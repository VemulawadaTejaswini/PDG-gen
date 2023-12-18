import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    final String s = sc.nextLine();
    final String t = sc.nextLine();

    for(int i = 0; i < t.length; i++) {
      for(int j = 1; j < s.contains(t.substring(i, j)); j++) {
      }
    }
    
    System.out.println((s.length - (j-1)).toString());
  }
}