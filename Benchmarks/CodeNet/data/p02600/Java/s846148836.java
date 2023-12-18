import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String ans = "";
        if (400 <= N && N < 600) {
        	ans = "8";
        } else if (600 <= N && N < 800) {
        	ans = "7";
        } else if (800 <= N && N < 1000) {
        	ans = "6";
        } else if (1000 <= N && N < 1200) {
        	ans = "5";
        } else if (1200 <= N && N < 1400) {
        	ans = "4";
        } else if (1400 <= N && N < 1600) {
        	ans = "3";
        } else if (1600 <= N && N < 1800) {
        	ans = "2";
        } else if (1800 <= N && N < 2000) {
        	ans = "1";
        }
        System.out.println(ans); 
    }
}