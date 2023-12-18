import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner cin = new Scanner(System.in);
    int a, b, c;
    a = cin.nextInt();
    b = cin.nextInt();
    c = cin.nextInt();
    
    int res = serch_divisor_number(a, b, c);

    System.out.println(res);
  }

  private static int serch_divisor_number(int a, int b, int c){
    int m = 0;
    for (int i = a; i <= b; i++){
      if (c % i == 0) m++;
    }
    return (m);
  }
}