import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sysin = sc.next();
        char[] chList = sysin.toCharArray();

        char ch = chList[0];

        if (Character.isLowerCase(ch)){
            System.out.println("a");
        }else{
            System.out.println("A");
        }
    }
}
