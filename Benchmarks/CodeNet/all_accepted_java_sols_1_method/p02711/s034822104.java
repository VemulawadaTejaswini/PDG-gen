import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String ans = "No";
        for (int i = 0; i < 3; i++){
            char c = s.charAt(i);
            if (c == '7'){
                ans = "Yes";
            }
        }
        System.out.println(ans);
    }
}