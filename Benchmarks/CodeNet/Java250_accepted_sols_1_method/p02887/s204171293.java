import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int N = sc.nextInt();
      String S = sc.next();
      
      int count = 1;//1つは絶対スライムが存在する
      
      char[] slime = S.toCharArray();
      
      //初めにスライムの2番目と1番目を比べる
      for(int i =1; i<N; i++){
      		if(slime[i]!=slime[i-1]){
              	count +=1;//被っていなかったら
            }
      }
       System.out.println(count);
    }
}  