import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String T = sc.nextLine();
    int sl = S.length();
    int tl = T.length();
    int miss = 1000;
    int m = 0;
    
    if(S.contains(T)){
      m = 0;
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
      System.out.println(miss);
    }
    
  }
}
