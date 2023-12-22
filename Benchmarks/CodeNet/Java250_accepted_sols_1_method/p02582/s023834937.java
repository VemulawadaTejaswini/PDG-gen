import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        String str = std.next();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(count == 0 && 'R' == (char)str.charAt(i))
                count++;
            if(i > 0 && str.charAt(i - 1) == str.charAt(i) && 'R' == (char)str.charAt(i))
                count++;
        }

        System.out.println(count);
    }

}