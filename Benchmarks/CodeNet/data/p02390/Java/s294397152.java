import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int time,hour = 0,minute = 0,second = 0;

        time = sc.nextInt();

        while(time - 3600 >= 0){
            hour += 1;
            time -= 3600;
        }
        while(time - 60 >= 0){
            minute += 1;
            time -= 60;
        }
        second = time;

        System.out.println(hour+":"+minute+":"+second);
    }
}
