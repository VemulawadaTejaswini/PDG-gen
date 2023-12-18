import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner スキャナー = new Scanner(System.in);
        byte 数字 = スキャナー.nextByte();
        if (数字 == 1){
            System.out.println("Hello World");
        }else if (数字 == 2){
            int 二歳[] = new int[2];
            二歳[0] = スキャナー.nextInt();
            二歳[1] = スキャナー.nextInt();
            System.out.println(二歳[0]+二歳[1]);
        }

    }
}