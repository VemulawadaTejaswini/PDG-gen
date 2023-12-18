import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        char[] charIn = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Scanner sc = new Scanner(System.in);
        
        String writing = "";
        while(sc.hasNext()){
            writing += sc.nextLine();    
        }
        writing = writing.toLowerCase();
        
        int[] count = new int[charIn.length];
        
        //暗黙的は怖いから初期値の設定
        for(int i = 0; i < charIn.length; i++){
            count[i] = 0;
        }
        
        //入力文字列の判定
        for(int i = 0; i < writing.length(); i++){
            for(int j = 0; j < charIn.length; j++){
                if(writing.charAt(i) == (charIn[j])){
                    count[j]++;
                }
            }
        }
        
        //出力
        for(int i = 0; i < charIn.length; i++){
            System.out.println(charIn[i] + " " + ":" + " " + count[i]);
        }
    }
}

