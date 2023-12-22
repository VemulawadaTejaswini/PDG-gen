import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String target = "ATGC";
        int max = 0;
        
        for (int l = 1; l <= str.length(); l++) {
            for (int s = 0; s <= str.length() - l; s++) {
                boolean success = true;
                for (int j = s; j < s + l; j++) {
                    char c = str.charAt(j);
                    //System.out.print(c + " ");
                    if (target.indexOf(c) < 0) {
                        //System.out.print("failed");
                        success = false;
                        break;
                    }
                }
                if (success) {
                    max = l;
                    break;
                }
                //System.out.println();
            }
            //System.out.println("max=" + max);
            //System.out.println();
        }
        
        System.out.println(max);
    }
}
