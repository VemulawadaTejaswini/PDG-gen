import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String T = sc.nextLine();
    //SとTの長さsl tl
    int sl = S.length();
    int tl = T.length();
    //一致していない文字数を数えmに格納。missよりmが小さければmissを更新する
    int miss = 1000;
    int m = 0;
    
    if(S.contains(T)){
      miss = 0;
    }else{
        for(int i = 0; i <= sl - tl; i++){
            for(int j = 0; j < tl; j++){
                if((S.substring(i + j, i + j + 1)).equals(T.substring(j, j + 1)) == false){
                    m += 1;
                }
            }
            if(miss > m){
                miss = m;
            }
            m = 0;
        }
    }
    System.out.println(miss);
  }
}