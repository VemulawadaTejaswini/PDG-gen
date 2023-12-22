import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int ans=0;
        if(str.equals("SAT"))
        ans=1;
        if(str.equals("SUN"))
        ans=7;
        if(str.equals("MON"))
        ans=6;
        if(str.equals("TUE"))
        ans=5;
        if(str.equals("WED"))
        ans=4;
        if(str.equals("THU"))
        ans=3;
        if(str.equals("FRI"))
        ans=2;
        System.out.println(ans);
    }
}
