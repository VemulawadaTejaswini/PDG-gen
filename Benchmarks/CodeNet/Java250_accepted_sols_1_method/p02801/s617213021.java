import java.util.*;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next(); //Sringで一文字入力
        char C = S.charAt(0); //Stringをcharに切り出し
        int tmp = (int)C; //文字を10進に変換
        tmp = tmp + 1;
        String hex = Integer.toHexString((int)tmp); //10進を16進文字列に変換
        char hex2 = (char)Integer.parseInt(hex, 16); //16進文字列をcharに変換
        System.out.println(hex2);
    }
}