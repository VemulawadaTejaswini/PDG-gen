import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(scn.hasNextLine()) {
            String[] vals = scn.nextLine().split("[+|=]");
            int a = 0;
            int b = 0;
            int c = 0;
            int i = 0;
            while(i < 10) {
                a = Integer.parseInt(vals[0].replace('X', (char)('0' + i)));
                b = Integer.parseInt(vals[1].replace('X', (char)('0' + i)));
                c = Integer.parseInt(vals[2].replace('X', (char)('0' + i)));
                if(a + b == c) {
                    break;
                }
                i++;
            }
            System.out.println(i < 10 ? i : "NA");
        }
    }
}