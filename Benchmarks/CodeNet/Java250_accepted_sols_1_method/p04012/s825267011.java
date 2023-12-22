import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String w;
        w = sc.next(); //入力された値
        int[] cntNum = new int[26]; //アルファベットの個数だけ配列を用意
        /* cntNumの中身を全部0に初期化 */
        for(int i:cntNum){
            i = 0; 
        }
        for(int j = 0; j < w.length(); j++){
            cntNum[w.charAt(j) - 'a']++;
        }
        for(int k:cntNum){
            if(k % 2 != 0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        
    }   
}
