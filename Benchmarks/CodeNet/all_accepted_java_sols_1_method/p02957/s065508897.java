import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = scan.nextInt();
        int second = scan.nextInt();
        String result = "";
        int flg = (first + second) % 2;
        if (flg == 1) {
            result = "IMPOSSIBLE";
        } else {
            result = String.valueOf((first + second) / 2);
        }
        
        System.out.println(result);
    }
 }