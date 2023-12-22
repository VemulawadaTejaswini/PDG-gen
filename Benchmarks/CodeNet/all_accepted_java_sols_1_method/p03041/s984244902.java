import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        String S = scanner.next();
        char[] ch = S.toCharArray();
        Character chatk = ch[K-1];
        ch[K-1] = Character.toLowerCase(chatk);

        System.out.println(String.valueOf(ch));
    }
}