import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String step = sc.next();
        String[] s = step.split("");
        String answer = "";
        for (int i = 0; i < s.length; i++) {
            if (i % 2 == 0 && s[i].equals("L")) {
                answer = "No";
                break;
            } else if (i % 2 == 1 && s[i].equals("R")) {
                answer = "No";
                break;
            } else {
                answer = "Yes";
            }
        }
        System.out.println(answer);
    }
}