import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// スペース区切りの整数の入力
		String S = sc.next();
      int count=0;
	for(int i=0;i<N-2;i++){
      if("ABC".equals(S.substring(i,i+3))){
        count++;
      }
    }
      System.out.println(count);
    }
}