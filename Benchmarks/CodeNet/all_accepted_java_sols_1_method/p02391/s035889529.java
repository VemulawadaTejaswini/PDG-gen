import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner nc = new Scanner(System.in);
        int a = nc.nextInt();
        int b = nc.nextInt();
        if(a < b){
            System.out.println("a < b");
        }else if(a > b){
            System.out.println("a > b");
        }else{
            System.out.println("a == b");
        }
    }
}
