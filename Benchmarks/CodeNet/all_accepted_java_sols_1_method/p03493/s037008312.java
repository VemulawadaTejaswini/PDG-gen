import java.util.Scanner;

public class Main{

    public static void main(String args[])throws Exception{

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        System.out.println(A.length() - A.replace("1", "").length());
    }
}
