import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String res = in.nextLine();
        in.close();
        boolean isMatch = false;

        loop:
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != res.charAt((i+j)%str.length())) {
                    break;
                } else if (j == str.length() - 1 && str.charAt(j) == res.charAt( (i+j) % str.length() )) {
                    isMatch = true;
                    break loop;
                }
            }
        }

        String ans = isMatch ? "Yes" : "No";
        System.out.println(ans);
    }

}