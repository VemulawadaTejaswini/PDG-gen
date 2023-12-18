import java.util.Scanner;

class Main{
  public static void main(String[] args){
    int i = 1;
    Scanner sc = new Scanner(System.in);
    while(true){
      int num = sc.nextInt();
      if(num == 0){
        break;
      }
      System.out.println("Case i: x\n");
      i++;
    }
  }
}