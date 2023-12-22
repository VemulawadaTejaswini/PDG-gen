import java.util.*;
import static java.lang.Math.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length() == 1){
            System.out.println("0");
            return;
        }

        int s_0 = s.replaceAll("1","").length();
        int s_1 = s.length() - s_0;

        int min = min(s_0, s_1);
        System.out.println(min*2);
    }
}