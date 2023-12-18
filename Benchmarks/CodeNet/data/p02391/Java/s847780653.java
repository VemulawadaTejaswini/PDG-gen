import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArray = br.readLine().split("\\s");
        Integer[] intArray;
        intArray = new Integer[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.valueOf(strArray[i]);
        }
        switch (intArray[0].compareTo(intArray[1])) {
            case 1:
                System.out.println("a > b");
                break;
            case -1:
                System.out.println("a < b");
                break;
            case 0:
                System.out.println("a == b");
                break;
        }
        
                } catch(IOException e) {
            System.err.println(e);
        }

    }
}