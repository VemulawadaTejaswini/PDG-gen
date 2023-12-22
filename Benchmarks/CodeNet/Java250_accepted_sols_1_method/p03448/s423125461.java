import java.util.Scanner;
import java.util.ArrayList;

class Main{
  public static void main(String[]arge){
    Scanner scanner = new Scanner(System.in);
    int count_500yen = scanner.nextInt();
    int count_100yen = scanner.nextInt();
    int count_50yen = scanner.nextInt();
    int ammount_price = scanner.nextInt();

    int count = 0;

    for(int i_500 = 0; i_500<=count_500yen;i_500++){
      for(int i_100 = 0; i_100<=count_100yen;i_100++){
        for(int i_50 = 0; i_50<=count_50yen;i_50++){
          int combi = 500*i_500 + 100*i_100 + 50*i_50;
          if(ammount_price == combi) count++;
        }
      }
    }
    System.out.println(count);
  }
}