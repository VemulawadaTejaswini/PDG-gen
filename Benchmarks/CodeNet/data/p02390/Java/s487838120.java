import java.util.*;
public class Main {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int s;
        int m;
        int h;
        s =sc.nextInt();
        m =s/60;
        h =m/60;
        s =s%60;
        m =m%60;
        h =h%60;
        System.out.println(h+";"+m+";"+s);
    }
}