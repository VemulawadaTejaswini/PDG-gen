import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int a = 0,b = 0;

        for(int i = 1;i < s.length(); i++){
            if(s.charAt(i - 1) != s.charAt(i))a++;
        }

        for(int i = s.length() - 2;i >= 0; i--){
            if(s.charAt(i + 1) != s.charAt(i))b++;
        }

        System.out.println(Math.min(a, b));


    }


}
