import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in);
        int [] hs = new int[10];
        for(int i=0;i<10;i++){
            hs[i] = in.nextInt();
        }
        Arrays.sort(hs);
        for(int i=0;i<3;i++){
            System.out.println(hs[10-i-1]);
        }
    }
}