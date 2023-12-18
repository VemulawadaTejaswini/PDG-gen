import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String s = sc.next();
        if(m >= s.length()){
            System.out.println(s);
        }else{
            System.out.println(s.substring(0,m) + "...");
        }
    }
}
