import java.util.Scanner;

public class Eight_c_1 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        while(sc.hasNext()) {
            str += sc.nextLine();
        }
        int[] count = new int[26];

        for(int i = 0; i < str.length(); i++) {
        	int c = str.toLowerCase().codePointAt(i) - 97;
        	if (c >= 0) count[c]++;
        }

        for(int i = 0; i < count.length; i++) {
        	System.out.println(String.format("%s : %d", (char) (i+97), count[i]));
        }
    }
}
