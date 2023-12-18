
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean flag = false;
        for(int i = 0; i <= x; i++){
            if((y-2*i)/4==(x-i)){
                flag = true;
            }
        }

        System.out.println(flag?"Yes":"No");
    }
}