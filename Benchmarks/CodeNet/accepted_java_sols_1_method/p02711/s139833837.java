import java.util.Scanner;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.indexOf('7') == -1)
            System.out.print("No");
        else
            System.out.print("Yes");
    }
}