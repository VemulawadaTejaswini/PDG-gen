import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        K--;
        String str = scanner.next();

        StringBuilder sb = new StringBuilder(str);

        if(str.charAt(K) == 'A'){
            sb.setCharAt(K, 'a');
        }else if(str.charAt(K) == 'B'){
            sb.setCharAt(K, 'b');
        }else if(str.charAt(K) == 'C'){
            sb.setCharAt(K, 'c');
        }

        System.out.println(sb);
    }
}
