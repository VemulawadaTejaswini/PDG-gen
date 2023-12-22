import javax.print.attribute.ResolutionSyntax;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap result = new HashMap();
        result.put("AC",0);
        result.put("WA",0);
        result.put("TLE",0);
        result.put("RE",0);
        int n = sc.nextInt();
        for(int i= 0; i<n;i++){
            String s = sc.next();
            int tmp = (int) result.get(s);
            tmp++;
            result.put(s,tmp);
        }
        System.out.println("AC"+ " "+ "x" + " "+ result.get("AC") );
        System.out.println("WA"+ " "+ "x" + " "+ result.get("WA") );
        System.out.println("TLE"+ " "+ "x" + " "+ result.get("TLE") );
        System.out.println("RE"+ " "+ "x" + " "+ result.get("RE") );

    }


}
