import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a = s / 1000;
        int b = s / 100 - 10 * a;
        int c = s / 10 - s / 100 * 10;
        int d = s - s / 10 * 10 ;
        if(a == b || b == c || c == d){
            System.out.println("Bad");
        }else{
            System.out.println("Good");
        }
        sc.close();
    }
}