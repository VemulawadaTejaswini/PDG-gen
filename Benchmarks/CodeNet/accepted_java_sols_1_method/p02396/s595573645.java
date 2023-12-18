import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> ary = new ArrayList<Integer>();
        while(true) {
            String t = br.readLine();
            if(new Integer(t) == 0)
                break;
            ary.add(new Integer(t));
        }
        for(int i=0;i < ary.size();i++) {
            System.out.println("Case " + (i+1) + ":" + " " + ary.get(i));
        }
    }
}