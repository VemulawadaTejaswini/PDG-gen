
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num[] = new int[5];
        int result = 0;
        for(int i = 0; i < 5; i++){
            num[i] = sc.nextInt();
            if(num[i] == 0){
                result = i + 1;
            }
        }
        System.out.println(result);
    }
}