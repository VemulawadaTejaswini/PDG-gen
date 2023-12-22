import java.util.*;


public class Main {
    public static int[][] ban; //盤面
    public static int N; //街の数
    public static int H; //盤面の縦
    public static int W; //盤面の横
    public static int crrPosX; //現在位置X
    public static int crrPosY; //現在位置Y
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int input = Integer.parseInt(str);
        String answer = "ABC";
        if(input > 999) {
          answer = "ABD";
          // input = input - 999;
        }
        // answer += String.valueOf(input);
        System.out.println(answer);
    }
}
