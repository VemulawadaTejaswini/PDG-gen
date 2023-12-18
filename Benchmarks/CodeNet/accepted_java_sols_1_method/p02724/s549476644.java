import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int fiveHundred;
        fiveHundred = x/500;
        int xx = x - fiveHundred * 500;
        int five;
        five = xx/5;
        int a = fiveHundred * 1000;
        int b = five * 5;
        System.out.println(a + b);
    }
}