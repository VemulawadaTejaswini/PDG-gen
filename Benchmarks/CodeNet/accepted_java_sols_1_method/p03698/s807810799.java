import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();
        int length = ch.length;
        boolean existsSame = false;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                // iとjが同じ場合は次のループ
                if (j == i) continue;
                if (ch[i] == ch[j]) {
                    existsSame = true;
                    break;
                }
            }
        }
        if (existsSame) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
