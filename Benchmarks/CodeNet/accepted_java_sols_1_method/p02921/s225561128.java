import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //N K
        char[] ifs = s.nextLine().toCharArray();
        char[] acts = s.nextLine().toCharArray();

        int ct = 0;
        for (int i = 0; i < ifs.length; i++) {
            if (ifs[i] == acts[i]) ct++;
        }

        System.out.println(ct);
    }
}