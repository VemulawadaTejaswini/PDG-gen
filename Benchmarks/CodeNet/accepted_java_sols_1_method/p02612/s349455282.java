import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int change = num%1000;
        if(change!=0){
            change = 1000 - change;
        }
        System.out.println(change);
        scan.close();
    }
}