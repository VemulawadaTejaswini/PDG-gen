import java.util.*;

public class Main {
    public static void main( String[] args) {
        int length;
        Scanner sc = new Scanner(System.in);
        String num = sc.next(); //1
        num = num.replaceAll("0", "");  //2
        length = num.length();  //3
        System.out.println(length); //4
    }
}

/* Process
1.in 3 String number(it's easier string than int.)
2.change 0 to " " (3 String number became only 1.)
3.search length 1 (It's answer.)
4.out results
*/