//import java.io.File;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) throws Exception {
    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);

    int input1 = scan.nextInt();
    for(int datasets = 0; datasets < input1; datasets++) {
      int money = scan.nextInt();
      int year = scan.nextInt();

      int maxMoney = 0;

      int input2 = scan.nextInt();
      for(int howmany = 0; howmany < input2; howmany++) {
        int dummyMoney = money;
        boolean istan = scan.nextInt()==0?true:false;
        double rate = scan.nextDouble();
        int must = scan.nextInt();
        int bank = 0;

        for(int i = 0; i < year; i++) {
          int up = (int)(dummyMoney*rate);
          if(istan) bank+=up;
          else dummyMoney+=up;
          dummyMoney -= must;
        }
        dummyMoney += bank;

        if(maxMoney < dummyMoney) maxMoney = dummyMoney;
      }
      System.out.println(maxMoney);
    }
  }
}