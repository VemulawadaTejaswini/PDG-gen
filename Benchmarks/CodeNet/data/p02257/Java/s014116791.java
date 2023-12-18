import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    static HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    
    /**
     * @param args
     * @throws IOException
     * @throws NumberFormatException
     */
    public static void main(String[] args) throws NumberFormatException,
            IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));

        int len = Integer.parseInt(reader.readLine());

        int[] arr = new int[len];

        String line;

        for (int i = 0; i < len; i++) {
            line = reader.readLine();
            arr[i] = Integer.parseInt(line);
        }

        int resultCount = 0;
        for (int j = 0; j < arr.length; j++) {
            if (isPrime(arr[j])) {
                resultCount++;
            }
        }

        System.out.println(resultCount);

    }

    private static boolean isPrime(int value) {
        
        if(map.entrySet().contains(value)){
            return map.get(value);
        }
        
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                map.put(value, false);
                return false;
            }
        }
        map.put(value, true);
        return true;
    }

}