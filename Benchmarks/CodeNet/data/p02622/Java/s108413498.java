import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
      //文字列Sの取得
      　 String strS = sc.next();
     　　String[] S = strS.split("");
      //文字列Tの取得
      　String strT = sc.next();
        String[] T = strT.split("");
      
      //置き換え回数
      int count = 0;
      
      //文字列を一文字ずつ比較
        for(int=0;i<strS.length;i++){
            if (!(S[i])==(T[i])){
              count++;
            }
        }
 
		System.out.println(count);
    }
}