import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int GET_UP_H = Integer.parseInt(scanner.next());
    int GET_UP_M = Integer.parseInt(scanner.next());
    int SLEEP_H = Integer.parseInt(scanner.next());
    int SLEEP_M = Integer.parseInt(scanner.next());
    int STUDY_TIME = Integer.parseInt(scanner.next());
    scanner.close();

    int ans_h = 0;
    int ans_m = 0;

    ans_h = SLEEP_H-1;
    ans_m = SLEEP_M+60;

    ans_m -= GET_UP_M;

    if(ans_m/60 == 1){
      ans_m -= 60;
      ans_h ++;
    }

    ans_h -= GET_UP_H;

    System.out.println(ans_h*60+ans_m-STUDY_TIME);
  }
}
