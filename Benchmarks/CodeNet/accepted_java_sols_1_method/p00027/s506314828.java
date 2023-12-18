import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Calendar cal = Calendar.getInstance();
    String[] weekName = {"Sunday","Monday","Tuesday","Wednesday",
                         "Thursday","Friday","Saturday"};
    while (true) {
      int month = sc.nextInt();
      if (month == 0) {
        break;
      }
      int day = sc.nextInt();
      cal.set(2004, month - 1, day);
      int week = cal.get(Calendar.DAY_OF_WEEK) - 1;
      System.out.println(weekName[week]);
    }
  }
}