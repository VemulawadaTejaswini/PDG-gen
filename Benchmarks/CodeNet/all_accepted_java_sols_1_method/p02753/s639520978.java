import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");

        if(s[0].equals(s[1]) && s[1].equals(s[2]) && s[2].equals(s[0])){
            System.out.println("No");
            return;

        }
        System.out.println("Yes");


    }
}