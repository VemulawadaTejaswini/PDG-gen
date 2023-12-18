import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
     
    public static void main(String[] args){
         
        //テキスト入力クラス
        Scanner sc = new Scanner(System.in);
         
        //入力文字を取得
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
         
        //配列に入れる
        int[] sort = {first,second,third};  
         
        //配列をソートする
        Arrays.sort(sort);
         
        //小さい順に並べる
        System.out.println(sort[0]+" "+sort[1]+" "+sort[2]);
    }
 
}