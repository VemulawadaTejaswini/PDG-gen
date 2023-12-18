import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[26];
        while(sc.hasNext()) {
            String s = sc.nextLine().toLowerCase();
            for(int i=0; i<s.length(); i++) {
                char ch = s.charAt(i);
                int num = ch - 'a';
                if(num >= 0 && num < 26) {
                    count[num]++;
                }
            }
        }
        for(int i=0; i<count.length; i++) {
            char ch = (char) (i + 'a');
            System.out.println(ch + " : " + count[i]);
        }
    }
}

