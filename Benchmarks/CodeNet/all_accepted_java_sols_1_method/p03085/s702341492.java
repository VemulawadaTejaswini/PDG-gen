import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String ans = "";
        ans = input.equals("A") ? "T" : ans;
        ans = input.equals("T") ? "A" : ans;
        ans = input.equals("C") ? "G" : ans;
        ans = input.equals("G") ? "C" : ans;

        System.out.println(ans);
    }
}