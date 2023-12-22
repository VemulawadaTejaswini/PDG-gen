import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int nextSunday = 0;
        
        switch(S){
            case "SUN": nextSunday++;
            case "MON": nextSunday++;
            case "TUE": nextSunday++;
            case "WED": nextSunday++;
            case "THU": nextSunday++;
            case "FRI": nextSunday++;
            case "SAT": nextSunday++;
        }
        
        System.out.println(nextSunday);
    }
}