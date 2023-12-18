import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        int second = scan.nextInt();
        int hour = second/3600;
        if (hour != 0 ) second = second % 3600;
        int minute = second/60;
        if (minute  != 0 ) second = second % 60;
        
        System.out.println(hour + ":" + minute + ":" + second);
    }
}

