import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String sa = "", sb = "";
        for (int i = 0; i < a; i++) sa += b;
        for (int i = 0; i < b; i++) sb += a;
        if (sa.compareTo(sb) < 0) System.out.println(sa);
        else System.out.println(sb);
        in.close();
    }
}
