import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ca = str.toCharArray();
        int[] count = new int[4];
        for (int i =0; i < ca.length; i++) {
            for (char c : ca) {
                if (c == ca[i]) {
                    count[i]++;
                }
            }
        }
        boolean key = true;
        for (int c:count) {
            if (c != 2) {
                key = false;
            }
        }
        if (key) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}