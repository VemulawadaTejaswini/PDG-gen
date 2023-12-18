
import java.util.Scanner;

class Main{
  public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.next());
        
        hh = i / 60 * 60;
        mm = (i - hh * 3600) / 60;
        ss = i - hh * 3600 - mm * 60 ;
        
        System.out.println(hh + ":" + mm + ":" + ss);
  }
}