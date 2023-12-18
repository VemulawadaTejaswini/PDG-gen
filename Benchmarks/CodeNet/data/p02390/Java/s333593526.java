import java.util.Scanner;

public class Main{
       public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
            
              int a = sc.nextInt();
              int second = a%60;
              int minute = a/60;
              int hour = minute / 60;
              minute = minute % 60;
              
              System.out.println(hour + ":" + minute + ":" + second );
       }
}