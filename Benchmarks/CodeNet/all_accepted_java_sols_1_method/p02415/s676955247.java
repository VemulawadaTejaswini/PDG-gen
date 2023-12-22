import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<length; i++){
            //1文字ずつ確認
            char c = str.charAt(i);
            //大文字の場合、小文字変換
            if(Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            //小文字の場合、大文字変換
            else if(Character.isLowerCase(c)) sb.append(Character.toUpperCase(c));
            //上記以外の場合、そのまま出力
            else sb.append(c);
        }
        System.out.println(sb);


    }

}


