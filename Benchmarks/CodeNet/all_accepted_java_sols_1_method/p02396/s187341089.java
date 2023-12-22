import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = 1;
    while(true){
      int value = sc.nextInt();
      if (value == 0){
        break;
      }
      System.out.println("Case " + count + ": " + value);
      count++;
    }
  }
}
