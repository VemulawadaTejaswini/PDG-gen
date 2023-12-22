import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taro = 0;//太郎の得点
        int hanako = 0;//花子の得点
        int scint = sc.nextInt();//最初に持っている枚数
        for (int i = 0; i < scint; i++) {
            int c = sc.next().compareTo(sc.next());//文字列１と文字列２を比較する
            if (c > 0) {//文字列１が大きいならば太郎に３点
                taro += 3;
            } else if (c == 0) {//引き分けならお互いに一点ずつ
                taro++;
                hanako++;
            } else {//それ以外なら花子に３点
                hanako += 3;
            }
        }
        System.out.println(taro + " " + hanako);
    }
}
