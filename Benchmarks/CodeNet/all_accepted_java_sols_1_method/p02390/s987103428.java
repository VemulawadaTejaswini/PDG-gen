import java.util.*;
class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int sec = sc.nextInt();
            int min;
            int hour;
           hour = sec / 3600;
           min = (sec % 3600) / 60;
           sec= sec % 60;
           
           System.out.println(hour + ":" + min + ":" + sec);
        }
    }
}
