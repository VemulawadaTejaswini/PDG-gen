
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int pre = Integer.parseInt(s.substring(0,2));
        int post = Integer.parseInt(s.substring(2));

        boolean isPreMonth = pre <= 12 && pre != 0;
        boolean isPostMonth = post <= 12 && post != 0;
        if(isPreMonth && isPostMonth){
            System.out.println("AMBIGUOUS");
        } else if(isPreMonth){
            System.out.println("MMYY");
        } else if(isPostMonth){
            System.out.println("YYMM");
        } else {
            System.out.println("NA");
        }


    }
}
