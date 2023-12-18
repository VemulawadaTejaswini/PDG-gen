import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.equals("RRR")) {
            System.out.println(3);
        } else if (s.equals("RRS") || s.equals("SRR")) {
            System.out.println(2);
        } else if(s.equals("SSS")){
            System.out.println(0);
        } else {
            System.out.println(1);
        }

    }

}