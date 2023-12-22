import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String S = sc.next();
      int K = sc.nextInt();
      String str=S;
      for(int i=0;i<N;i++){
        if(S.charAt(i)!=S.charAt(K-1)){
          str = str.substring(0,i)+"*"+str.substring(i+1);
        }
      }
      System.out.println(str);
    }
}