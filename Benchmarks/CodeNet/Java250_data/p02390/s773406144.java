import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdId = new Scanner(System.in);
        int s = stdId.nextInt();
        int hh = (int)s/3600;
        int mm = (int)s%3600/60;
        int ss = (int)s%3600%60;
        System.out.println(hh+":"+mm+":"+ss);
    }
}