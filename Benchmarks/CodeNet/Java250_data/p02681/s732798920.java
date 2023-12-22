import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        String s = stdIn.next();
        String t = stdIn.next();

        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();

        for(int i=0; i<cs.length; i++){
            if(cs[i] != ct[i]){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}