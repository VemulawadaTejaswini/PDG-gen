
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String number;
            List<Integer> list = new ArrayList<Integer>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                number = reader.readLine();
                
                if ( Integer.parseInt(number) == 0) {
                    break;
                } else {
                    int sum= 0;
                    int count = 0;
                    for (int i = 0 ; i < number.length() ; i++ ) {
                        count = Character.getNumericValue(number.charAt(i));
                        sum += count;
                    } 
                    if (sum != 0) {
                        list.add(sum);
                    }
                }
            }
            for (int i = 0; i < list.size();i++) {
                System.out.println(list.get(i));
            }
        } catch ( IOException e) {
        
        }
    }
}