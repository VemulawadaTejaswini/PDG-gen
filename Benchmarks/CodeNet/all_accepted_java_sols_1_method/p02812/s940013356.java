import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int answer = 0;
        for (int i = 3; i <= a; i++) {
            if (b.substring(i - 3, i).equals("ABC")) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
