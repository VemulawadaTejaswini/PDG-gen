import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if (s.contains("C")) {
            s=s.substring(s.indexOf("C"));
            if (s.contains("F")) {
                System.out.println("Yes");
                return ;
            }
        }
        System.out.println("No");
    }
}