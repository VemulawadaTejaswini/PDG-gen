import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int num = 0;

        for(int i = 0; i < str.length()/2; i ++) {
            char char1 = str.charAt(i);

            char char2 = str.charAt(str.length()-i-1);

            if(!(str.charAt(i)==str.charAt(str.length()-i-1))) {
                num++;
            }
        }

        System.out.print(num);

    }
}