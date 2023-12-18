import java.util.Scanner;

class Main{
  public static void main(String args[]){
    while(true){
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      String op = sc.nextString();
      int b = sc.nextInt();

      if(op == "?"){
        break;
      }else{
        println(a+op+b);
      }
    }
  }
}
