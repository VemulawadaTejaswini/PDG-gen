import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(N == i*j){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
        return;
    }
}