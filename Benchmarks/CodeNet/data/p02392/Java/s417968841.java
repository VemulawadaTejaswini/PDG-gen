import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        String ans;
        if ((a < b) && (b < c)){
            ans = "Yes";
        } else {
            ans = "No";
        }
        System.out.println(ans);
    }
}
