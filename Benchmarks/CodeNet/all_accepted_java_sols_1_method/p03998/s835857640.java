import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a_count = 0, b_count = 0, c_count = 0;
        String a = in.next();
        String b = in.next();
        String c = in.next();
        char next = a.charAt(a_count);
        a_count++;
        boolean notEmpty = true;
        while (notEmpty){
            if (next == 'a'){
                if (a_count == a.length()){
                    System.out.println('A');
                    return;
                }
                else{
                    next = a.charAt(a_count);
                    a_count++;
                }
            }
            else if (next == 'b'){
                if (b_count == b.length()){
                    System.out.println('B');
                    return;
                }
                else{
                    next = b.charAt(b_count);
                    b_count++;
                }
            }
            else {
                if (c_count == c.length()){
                    System.out.println('C');
                    return;
                }
                else{
                    next = c.charAt(c_count);
                    c_count++;
                }
            }
        }
    }
}