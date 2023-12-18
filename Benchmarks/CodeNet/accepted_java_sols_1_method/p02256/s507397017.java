import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] arr = line.split(" ");

        // String型をint型に変換
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        int x;
        int y;

        if(a > b){
            x = a;
            y = b;
        } else{
            x = b;
            y = a;
        }

        // ユークリッドの互除法
        int c;
        while((c = x % y) != 0){
            x = y;
            y = c;
        }

        System.out.println(y);
        sc.close();

    }
}
