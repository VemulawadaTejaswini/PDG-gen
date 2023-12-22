import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] wordStr = word.toCharArray();
            if(wordStr[2] != wordStr[3]){
                System.out.println("No");
                return;
            }
            if (wordStr[4] != wordStr[5]){
                System.out.println("No");
                return;
            }
            System.out.println("Yes");
    }
}
