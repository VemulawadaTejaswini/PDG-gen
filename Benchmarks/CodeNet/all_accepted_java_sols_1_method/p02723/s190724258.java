import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String s = stdIn.next();
        char[] cs = s.toCharArray();

        if(cs[2] == cs[3] && cs[4] == cs[5]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}