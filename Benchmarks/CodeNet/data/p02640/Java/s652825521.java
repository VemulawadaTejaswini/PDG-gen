
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        if(y % 2 == 0 && x * 2 <= y && x * 4 >= y){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
