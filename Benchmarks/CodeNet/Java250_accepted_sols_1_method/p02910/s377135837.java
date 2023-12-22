import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        boolean isGood = true;
        for (int i=1; i<=s.length(); i++) {
            if (i % 2 == 0) {
                if (!(s.charAt(i-1) == 'L' || s.charAt(i-1) == 'U' || s.charAt(i-1) == 'D')) {
                    isGood = false;
                    break;
                }
            } else {
                if (!(s.charAt(i-1) == 'R' || s.charAt(i-1) == 'U' || s.charAt(i-1) == 'D')) {
                    isGood = false;
                    break;
                }
            }
        }
        System.out.print(isGood ? "Yes" : "No");
    }
}