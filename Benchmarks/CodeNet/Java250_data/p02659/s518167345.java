import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        String strB = sc.next();

        int B_100 = Integer.parseInt(strB.replace(".", ""));

        long tmp = A*B_100;
        System.err.println(tmp);

        String tmpStr = Long.toString(tmp);
        int length = tmpStr.length();

        String result;
        if(length >= 3) {
            result = tmpStr.substring(0, length-2);
        }else {
            result = "0";
        }

        System.out.println(result);
    }
}