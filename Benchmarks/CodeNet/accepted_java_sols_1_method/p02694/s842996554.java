import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long X = sc.nextLong();
      long money = 100l;
      int i = 0;
      while(money < X){
        money += money / 100l;
        i++;
      }
      System.out.println(i);
    } 
}