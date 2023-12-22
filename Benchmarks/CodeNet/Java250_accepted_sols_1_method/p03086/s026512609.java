import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        int max = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a == 'A' || a == 'C'|| a == 'G' || a == 'T') {
                count++;
            } else {
                if (max < count) max = count;
                count = 0;
            }
        }
        if (max < count) max = count;

        System.out.println(max);
    }
}