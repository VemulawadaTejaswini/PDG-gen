import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] count = new int[26];
        while (sc.hasNext()) {
            String line = sc.nextLine();
            line = line.toLowerCase();
            char[] ch = line.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                int n = ch[i] - 'a';
                if (0 <= n && n <= 25) {
                    count[n]++;
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            char c = (char)(i+'a');
            System.out.println(c + " : "+ count[i]);
        }
        sc.close();
        
    }

}