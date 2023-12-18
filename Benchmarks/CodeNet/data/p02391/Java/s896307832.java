import java.util.Scanner;

public class Main{
    private static int a, b;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Main ain = new Main();
        Main.a = scan.nextInt();
        Main.b = scan.nextInt();
        if(Main.a < Main.b){
            System.out.println("a < b");
        }
        else if(Main.a > Main.b){
            System.out.println("a > b");
        }
        else{
            System.out.println("a == b");
        }
    }
}


