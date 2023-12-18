import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        sc.useDelimiter("\n");

        while (true) {
            String[] strArray = sc.next().split("");
            if (strArray[0].equals("0")) break;
            int sum = 0;
            for (String s : strArray)
                sum += Integer.parseInt(s);
            pw.println(sum);
        }
        
        pw.flush();
    }
}
