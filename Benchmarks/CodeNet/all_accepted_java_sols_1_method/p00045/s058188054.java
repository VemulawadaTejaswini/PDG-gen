import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sumMoney = 0;
    int sumProduct = 0;
    int counter =0;
    while(sc.hasNext()) {
      String str = sc.next();
      String[] strArr = str.split(",");
      sumMoney += Integer.parseInt(strArr[0])*Integer.parseInt(strArr[1]);
      sumProduct += Integer.parseInt(strArr[1]);
      counter++;
    }
    System.out.println(sumMoney);
    System.out.println(Math.round((float)sumProduct/counter));
  }
}