import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long yen = 1000;
    long stock = 0;
    int n = sc.nextInt();
    int[] price = new int[n];
    for(int i = 0; i < n; i++){
      price[i] = sc.nextInt();
    }
    int day = 0;
    int mode = 1;
    while(day < n){
      int now_price = price[day];
      if(mode == 1){
        //買い時をさぐる
        if(day < n - 1 && price[day + 1] <= now_price){
          day++;
          continue;
        } else if(day + 1 != n){
          //全力で買う
          stock = yen / now_price;
          yen -= stock * now_price;
          mode = 0;
          day++;
        } else {
          day++;
        }
      } else {
        //売り時をさぐる
        if(day < n - 1 && price[day + 1] >= now_price){
          day++;
          continue;
        } else {
          //全力で売る
          yen += now_price * stock;
          stock = 0;
          mode = 1;
          day++;
        }
      }
    }
    System.out.println(yen);
  }
}