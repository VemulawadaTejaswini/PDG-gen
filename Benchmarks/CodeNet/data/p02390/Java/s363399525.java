import java.util.Scanner;

class Main{
  public static void main(String arg[]){
    Scanner scan = new Scanner(System.in);

    int hour=0, minute=0, second=0;
    int inSecond = scan.nextInt();

    minute = inSecond / 60;
    second = inSecond % 60;
    hour   = minute / 60;
    minute = minute % 60;

    System.out.println(hour+":"+minute+":"+second);
    
  }
}