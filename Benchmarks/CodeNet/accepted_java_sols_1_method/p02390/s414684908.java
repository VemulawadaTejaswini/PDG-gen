import java.util.Scanner;

class Main{
 public static void main(String[] args){
  int S;
  Scanner scn = new Scanner(System.in);
  S = scn.nextInt();
  int hour;
  int minute;
  int second;
  hour = S/3600;
  minute = (S-3600*hour)/60;
  second = S-3600*hour-minute*60;

  System.out.println(hour+":"+minute+":"+second);
}
}