import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    scanner.close();

    int g = 0;
    int p = 0;
    for(int i=0; i<s.length(); i++){
      switch(s.charAt(i)){
        case 'g':
          g++;
          break;
        case 'p':
          p++;
          break;
      }
    }

    System.out.println((g-p)/2);
  }
}
