import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();

        String moji = new String();
        for(int i = 0; i < x.length(); i++)  {
            moji += "x";
        }



        System.out.println(moji);
    }
}