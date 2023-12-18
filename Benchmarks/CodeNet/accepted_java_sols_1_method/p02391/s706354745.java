import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        if(a>b){
            System.out.println("a > b");
        }else if(a<b){
            System.out.println("a < b");
        }else{
            System.out.println("a == b");
        }

    }
}
