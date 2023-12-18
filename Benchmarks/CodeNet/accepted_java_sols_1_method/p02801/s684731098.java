import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.next().charAt(0);
        System.out.println((char)(x+1));
    }
}