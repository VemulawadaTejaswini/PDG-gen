import java.util.Scanner;

public final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        String s = stdIn.next();
        char[] cs = s.toCharArray();
        if(cs[0]==cs[1] || cs[1]==cs[2] || cs[2]== cs[3]){
            System.out.println("Bad");
        }else{
            System.out.println("Good");
        }
    }
}