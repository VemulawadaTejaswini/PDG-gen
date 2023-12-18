import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String str = input.next();
    int n = str.length();
    for (int i = 0; i < n; i++){
      char c = str.charAt(i);
      if (c == 'X'){
        System.out.print('A');
      }
      else if (c == 'Y'){
        System.out.print('B');
      }
      else if (c == 'Z'){
        System.out.print('C');
      }
      else {
        System.out.print((char)(c - 3));
      }
    }
    System.out.println();
  }
}