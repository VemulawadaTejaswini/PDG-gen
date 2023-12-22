import java.util.Scanner;
class Main{
  public static void main (String[] args){
    Scanner stdIn = new Scanner(System.in);
    
    long  X = stdIn.nextLong();
    
    int y = 0;
    double money = 100;
    do{
      double r =Math.floor(money * 0.01);
      money = money + r;
      y++;
    }while(money < X);
    System.out.println(y);
  }
}
