import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String n = scn.next();

        String ans = n.substring((n.length() - 1));
        int a = Integer.parseInt(ans);


        if (a == 3) {
            System.out.println("bon");
        } else if (a == 0 || a == 1 ||a == 6 ||a == 8){
            System.out.println("pon");
        }else{
            System.out.println("hon");
        }


            scn.close();
    }
}