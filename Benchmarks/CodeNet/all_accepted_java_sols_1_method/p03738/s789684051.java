import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String a = br.readLine();
            int alen = a.length();
            String b = br.readLine();
            int blen = b.length();
            if (alen > blen) {
                System.out.println("GREATER");
            } else if (alen < blen) {
                System.out.println("LESS");
            } else {
                boolean breakFlag = false;
                for (int i = 0; i < alen; i++) {
                    int aNum = Integer.parseInt(a.substring(i, i + 1));
                    int bNum = Integer.parseInt(b.substring(i, i + 1));
                    if (aNum > bNum) {
                        System.out.println("GREATER");
                        breakFlag = true;
                        break;
                    } else if (aNum < bNum) {
                        System.out.println("LESS");
                        breakFlag = true;
                        break;
                    }
                }
                if (!breakFlag) {
                    System.out.println("EQUAL");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}