import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] s2 = s.toCharArray();
        s2[3] = '8';
        System.out.println(s2);
    }
}