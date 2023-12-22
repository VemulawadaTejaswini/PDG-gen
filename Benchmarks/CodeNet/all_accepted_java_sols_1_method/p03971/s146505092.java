import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int j =1, over = 1, bRank = 0, passed = 0;
        String s = sc.next();
        for(int i=0;i<s.length();i++) {
            int k = i+1;
            if (s.charAt(i) == 'a' && passed < (a+b)) {
                j = j+1;
                passed += 1;
                System.out.println("Yes");
            }
            else if (s.charAt(i) == 'b' && passed < (a+b) && (bRank) < b) {
                over = over +1;
                bRank += 1;
                passed += 1;
                System.out.println("Yes");
            }
            else if (s.charAt(i) == 'c') {
                System.out.println("No");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
