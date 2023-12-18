import java.util.Scanner;

public class Main{
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.err.print("N");
  int N = scanner.nextInt();


  if(N%2 == 0){
  System.out.println(N/2);
  }
  else if(N%2 == 1){
  System.out.println(N/2 + 1);
  }
}
}
