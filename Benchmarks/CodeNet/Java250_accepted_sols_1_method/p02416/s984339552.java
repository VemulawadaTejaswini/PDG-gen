
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            String number;
            ArrayList<Integer> list = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                number = reader.readLine();
                
                if ( number.equals("0")) {
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
            System.out.println(e);
        }
    }
}