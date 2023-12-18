import java.util.Scanner;

class Main {  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    
    int Taro = 0;
    int Hanako = 0;
    
    while (num != 0) {
      String taro = in.next();
      String hanako = in.next();
      if      (taro.compareTo(hanako) < 0) {Hanako += 3; }
      else if (taro.compareTo(hanako) > 0) {Taro += 3; }
      else                                 {Taro += 1; Hanako += 1;}
      num--;
    }
    System.out.println(Taro + " " + Hanako);
  }
}