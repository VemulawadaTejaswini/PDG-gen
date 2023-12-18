import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        hourMinuteSecond(S);
        
    }
    public static void hourMinuteSecond(int seconds){
        int minutes = seconds / 60;
        seconds = seconds % 60;
        
        int hours = minutes / 60;
        minutes = minutes % 60;
        
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}

