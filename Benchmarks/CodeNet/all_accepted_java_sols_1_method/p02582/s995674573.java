import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int ans = 0;

        switch(s){
            case "SSR":
            case "SRS":
            case "RSS":
            case "RSR":
                ans = 1;
                break;
            case "SRR":
            case "RRS":
                ans = 2;
                break;
            case "RRR":
                ans = 3;
                break;
        }

        System.out.print(ans);

    }
}
