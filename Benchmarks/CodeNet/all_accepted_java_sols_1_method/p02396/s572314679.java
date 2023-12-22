import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // 入力値を受け取りinputに格納，inputが0でない限りfor文内の処理を行う
        int input;
        for(int i = 1; (input = scan.nextInt()) != 0; ++i){
            System.out.println("Case " + i + ": " + input);
        }
    }
}
