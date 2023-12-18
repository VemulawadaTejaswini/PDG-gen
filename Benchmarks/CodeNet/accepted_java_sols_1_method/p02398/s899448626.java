import java.util.Scanner;

public class Main{
  
  public static void main(String[] args) {
    
    Scanner sin = new Scanner(System.in);

    int a = sin.nextInt();
    int b = sin.nextInt();
    int c = sin.nextInt();
    int count = 0;

    for( int i = a; i <= b; i++) {
      if( (c % i) == 0) count++;
    }

    System.out.println(count);

    sin.close();
  }
}
