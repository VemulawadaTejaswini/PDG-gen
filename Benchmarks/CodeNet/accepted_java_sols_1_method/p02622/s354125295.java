import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String t = input.next();
        long counter = 0;
        for(int i = 0; i < s.length(); i ++) {
            if(s.charAt(i) != t.charAt(i)) {
                counter ++;
            }
        }
        System.out.println(counter);
    }

}