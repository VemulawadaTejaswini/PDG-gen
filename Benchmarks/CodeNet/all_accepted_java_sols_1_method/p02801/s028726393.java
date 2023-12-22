import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String s;
        s=scan.next();
        char c = s.charAt(0);
        c+=1;
        System.out.println(c);
    }
}