import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        for (int i = 0; i < week.length; i++){
            if(Objects.equals(week[i], a)) {
                System.out.println(7 - i);
            }
        }
    }
}