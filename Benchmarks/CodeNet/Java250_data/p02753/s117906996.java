import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String s = stdIn.next();
        char[] cs = s.toCharArray();

        if(cs[0] == cs[1] && cs[1] == cs[2]){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}