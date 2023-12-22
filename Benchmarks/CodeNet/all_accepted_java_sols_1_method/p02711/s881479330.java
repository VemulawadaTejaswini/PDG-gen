import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] n = sc.next().toCharArray();

        String ans = "No";
        for(int i = 0;i < n.length;i++) {
            if(n[i] == '7') ans = "Yes";
        }

        System.out.println(ans);
    }

}
