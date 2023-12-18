import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        String w = sc.next();
        while (sc.hasNext()) {
            array.add(sc.next());
        }
        sc.close();
        int count =0; 
        for (String string : array) {
            if(string.equalsIgnoreCase(w)){
                count++;
            }
        }
        System.out.println(count);
    }

}