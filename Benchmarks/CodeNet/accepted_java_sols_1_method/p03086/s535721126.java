import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String str = in.next();
        int max = 0;
        for (int i = 0; i < str.length(); i++){
            int sum = 0;
            for (int j = i; j < str.length(); j++){
                if (str.charAt(j) == 'A' || str.charAt(j) == 'C' || str.charAt(j) == 'G' || str.charAt(j) == 'T'){
                    sum++;
                    max = Math.max(max, sum);
                }
                else break;
            }
        }
        System.out.println(max);
    }
    
}