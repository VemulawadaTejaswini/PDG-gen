import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int now = 0;
        String[] S = new String[H];
        for (int i = 0; i < H; i++) {
            S[i] = sc.next();           
        }
        int index = 1;
        for (String s : S) {
            index--;
            boolean order = true;
            for (int i = 0; i < s.length(); i++) {
                char nowmark = s.charAt(i);
                if (nowmark == '#') {
                    if (i != index) {
                        System.out.println("Impossible");
                        return;
                    }
                    if (!order) {
                        System.out.println("Impossible");
                        return;
                    }
                    index++;
                } else {
                    if (i >= index) {
                        order = false;
                    }
                }
            }
        }
        System.out.println("Possible");
    }
    
}