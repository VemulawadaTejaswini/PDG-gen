import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int lens = s.length();
        String ans = "Yes";
        int lens2 = (int)(lens-1)/2;

        for(int i=0;i<lens2;i++){
            if (s.charAt(i) != s.charAt(lens2-i-1)) {
                ans = "No";
            }
        }
        for(int i=((lens+3)/2)-1;i<lens;i++){
            if (s.charAt(i) != s.charAt(lens-i-1)) {
                ans = "No";
            }
        }

        System.out.println(ans);

    }
}
