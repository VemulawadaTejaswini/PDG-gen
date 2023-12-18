import java.util.*;
import java.io.*;

/*IndexOfメソッドを使うことで、配列やコレクション内の要素を検索することができます。
検索する値と一致する要素が見つかれば、はじめに見つかったインデックス番号を返します。
見つからなければ、 -1 を返します。
IndexOfメソッドは、配列の場合は、スタティックメソッド（Array.IndexOfメソッド）です。
コレクションでは、ArrayList（ArrayList.IndexOfメソッド）や
List（List<T>.IndexOfメソッド）で使用でき、こちらはインスタンスメソッドです。
*/

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        

//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();//　n個ある

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        
        int j;
        String[] mycards = new String[2];//入れる箱
        int num = 0;//トランプの番号
        
        ArrayList<Integer> S = new ArrayList<Integer>();//不揃いカードスペード用
        ArrayList<Integer> H = new ArrayList<Integer>();//不揃いカードハート用
        ArrayList<Integer> C = new ArrayList<Integer>();//不揃いカードクローバー用
        ArrayList<Integer> D = new ArrayList<Integer>();//不揃いカードダイヤ用
       
        for(int i = 0; i < n; i++){
            
            mycards = reader.readLine().split(" ");
            num =  Integer.parseInt(mycards[1]);
            
            if("S".equals(mycards[0])){
                S.add(num);
//                System.out.println(mycards[1]);
                
            }else if("H".equals(mycards[0])){
                H.add(num);
//                System.out.println(mycards[1]); 
            }else if("C".equals(mycards[0])){
                C.add(num);
            }else if("D".equals(mycards[0])){
                D.add(num);
            }
        }
            for( j = 1; j <= 13; j++){
                if( S.indexOf(j) == -1){
                    System.out.println("S " + j);
                }
                
            }
            for( j = 1; j <= 13; j++){
                if( H.indexOf(j) == -1){
                    System.out.println("H " + j);
                }
            }
            for( j = 1; j <= 13; j++){
                if( C.indexOf(j) == -1){
                    System.out.println("C " + j);
                }
            }
            for( j = 1; j <= 13; j++){
                if( D.indexOf(j) == -1){
                    System.out.println("D " + j);
                }
            }
    }
}


