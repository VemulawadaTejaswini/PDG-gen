import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //一回音を聞くことにかかる費用
    int soundPrice = Integer.parseInt(scan.next());
    //手持ちのお金
    int haveMoney = Integer.parseInt(scan.next());
    //聞きたい回数
    int count = Integer.parseInt(scan.next());

    int result = haveMoney / soundPrice;
    if(result >= count){
      System.out.println(count);
    }else{
      System.out.println(result);
    }
  }
}
