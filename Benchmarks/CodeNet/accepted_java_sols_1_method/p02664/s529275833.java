import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String T = sc.next();
        char[] charArray = T.toCharArray();

        for(int i=0; i<charArray.length; i++) {
            if(charArray[i] == '?') {
                charArray[i] = 'D';
            }
        }


        for(char output: charArray) {
            System.out.print(output);
        }
        System.out.println();
    }
}