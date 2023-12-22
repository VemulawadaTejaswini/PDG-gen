import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long time = sc.nextLong();
        
        long sec = time % 60;
        
        long minuteAll = time / 60;
        long minute = minuteAll % 60;
        long hour = minuteAll / 60;
        
        System.out.println(hour + ":" + minute + ":" + sec);
    }
}