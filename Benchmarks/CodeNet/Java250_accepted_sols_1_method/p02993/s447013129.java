import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] c =a.split("");
        int bad = 0;
        for (int i = 0; i <= 2; i++) {
            if(c[i].equals(c[i+1])){
                bad++;
            }
        }
        if (bad >= 1) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
    }
}