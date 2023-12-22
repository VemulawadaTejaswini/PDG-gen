
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int i = 0;
        for ( i = 0; i<=10000; i++){
            if(a*i>=h){
                break;
            }
        }
        System.out.println(i);
    }
}