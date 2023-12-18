import java.util.*;

public class Main{
    static String[] days = {"SUN","SAT","FRI","THU","WED","TUE","MON"};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        for(int i = 0; i < days.length; i++){
            if(day.equals(days[i])){
                System.out.println(i == 0 ? 7 : i);
            }
        }
    }
}
