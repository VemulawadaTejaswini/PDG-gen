import java.util.Scanner;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        //コード
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.next());
        long y = 0;
        try {
            for (int i = 0; i < cnt; i++){
                if (i == 0){
                    y = Integer.parseInt(sc.next());
                } else {
                    y *= Integer.parseInt(sc.next());
                }
                if (y > Math.pow(10, 18)){
                    System.out.println(-1);
                    break;
                }
            }
            System.out.println(y);
        } catch(Exception e){
            System.out.println(-1);
        }

        sc.close();
    }
}