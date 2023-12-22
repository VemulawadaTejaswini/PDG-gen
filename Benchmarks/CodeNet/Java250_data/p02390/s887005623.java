import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int sec = scan.nextInt();
    int hour = sec / 3600;
    sec -= hour*3600;
    int min = sec / 60;
    sec -= min*60;

    System.out.println(hour+":"+min+":"+sec);

    }
}