import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String[] temp_a = a.split("");
        String[] temp_b = b.split("");

        int ans = 0;
        for (int i = 0; i < temp_a.length; i++) {
            if (!(temp_a[i].equals(temp_b[i]))) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}