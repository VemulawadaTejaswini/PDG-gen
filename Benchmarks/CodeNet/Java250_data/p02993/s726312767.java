import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        boolean Judge = false;
        for (int i = 1; i < s.length; i++) {
            if (s[i-1] == s[i]) {
                Judge = !Judge;
                break;
            }
        }

        if (Judge) {
            System.out.println("Bad");
        }else{
            System.out.println("Good");
        }
    }
}
