import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner( System.in );
    int A = sc.nextInt();
    int B = sc.nextInt();
    int quot = (B-A)/(A-1);
    int mod = (B-A)%(A-1);
    
    if (mod > 0) {
      quot ++;
    }
    
    System.out.println(quot+1);
    
  }
}