import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("");
        
        for (int i=0; i<n.length; i++) {
            if (n[i].equals("1")) {
                n[i] = "9";
            } else if (n[i].equals("9")) {
                n[i] = "1";
            }
        }
        
        String result = "";
        for (String s : n) {
            result += s;
        }
        System.out.println(result);
    }
}
