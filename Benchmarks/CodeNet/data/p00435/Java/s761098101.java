import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String str = input.next();
    int n = str.length();
    for (int i = 0; i < n; i++){
      char c = str.charAt(i);
      if (c == 'A'){
        System.out.print('X');
      }
      else if (c == 'B'){
        System.out.print('Y');
      }
      else if (c == 'C'){
        System.out.print('Z');
      }
      else {
        System.out.print((char)(c - 3));
      }
    }
    System.out.println();
  }
}