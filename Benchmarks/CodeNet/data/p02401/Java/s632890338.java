import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    while(true){
      int a = sc.nextInt();
      String op = sc.next();
      int b = sc.nextInt();

      switch(op){
        case "+" : println(a+b);
      }
    }
  }
}
