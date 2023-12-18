import java.util.*;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String s = sc.next();
        int res = 0;
      	if ("SUN".equals(s)) res = 7;
      	if ("MON".equals(s)) res = 6;
      	if ("TUE".equals(s)) res = 5;
      	if ("WED".equals(s)) res = 4;
      	if ("THU".equals(s)) res = 3;
      	if ("FRI".equals(s)) res = 2;
      	if ("SAT".equals(s)) res = 1;
      	System.out.println("" + res);
    }
}