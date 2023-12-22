import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String T = sc.next();
      int N = S.length();
      int R = 0;
      for(int i = 0;i<N;i++){
        String a = S.substring(i,i+1);
        String b = T.substring(i,i+1);
        if(a.equals(b)){
          R += 1;
        }else{
          continue;
        }
      }
      System.out.println(R);
    }
}