import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
 
        switch (s) {
            case "SUN":
                ans = 7;
                break;
            case "MON":
                ans = 6;
                break;
            case "TUE":
                ans = 5;
                break;
            case "WED":
                ans = 4;
                break;
            case "THU":
                ans = 3;
                break;
            case "FRI":
                ans = 2;
                break;
            case "SAT":
                ans = 1;
        }
        System.out.println(ans);
    }
}