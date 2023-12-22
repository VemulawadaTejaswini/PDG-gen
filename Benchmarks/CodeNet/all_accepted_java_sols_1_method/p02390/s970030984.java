import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        if (input < 0 || input > 86400) {
            System.err.println("Err!"); //標準エラー出力
            return;
        }
        int hour = input / 3600;
        int minutes = (input % 3600) / 60;
        int seconds = (input % 3600) % 60;
        
        System.out.printf("%d:%d:%d%n", hour, minutes, seconds);
    }

}

// 1時間 = 60分 = 3600秒

// 秒数を3600で割る→時間を算出

// 余った数字を60で割る→分を算出


