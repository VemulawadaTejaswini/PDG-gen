import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;

        switch (s) {
            case "RRR":
                ans = 3;
                break;
            case "RRS": 
            case "SRR": 
                ans = 2;
                break;
            case "RSR": 
            case "SSR":
            case "SRS":
            case "RSS":
                ans = 1;
                break;
        }
        System.out.println(ans);
    }
}