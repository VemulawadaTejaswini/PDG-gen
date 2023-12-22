import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String ss = s.substring(0, s.length()/2);
        if(s.equals(ss + ss)) System.out.println("Yes");
        else System.out.println("No");
    }
}