import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner in = new Scanner(System.in);
        String forecast = in.next();
        String fact = in.next();
        int count = 0;
        for (int i = 0;i < forecast.length();i++){
            if (forecast.substring(i, i+1).equals(fact.substring(i, i+1))){
                count++;
            }
        }

        System.out.println(count);

    }
}
