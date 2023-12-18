import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            char s = sc.next().charAt(0);
            int diff = 'a' - 'A';   //diff == 32; ASCIIコードで大文字小文字を変換
            System.out.print((char)(s - diff));
        }
    }
}
