import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int m = Integer.parseInt(s.substring(5, 7));
        System.out.println(m <= 4 ? "Heisei" : "TBD");
        scan.close();
    }
}