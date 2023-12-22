import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] ch = str.toCharArray();
        int i = 0;
        int maxcount = 0;
        while(i < ch.length) {
            if(ch[i] != 'R') {
                i++;
                continue;
            }
            int count= 0;
            while ( i < ch.length && ch[i] == 'R') {
                count++;
                i++;
            }

            maxcount = Math.max(maxcount, count);
            i++;
        }

        System.out.println(maxcount);
    }

}
