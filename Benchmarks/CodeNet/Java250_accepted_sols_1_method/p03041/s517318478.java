import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int k = sc.nextInt();
		String s = sc.next();
      	for(int i=0;i<n;i++){
          if(i==k-1){
		System.out.print((char)(s.charAt(i)-('A'-'a')));
          }else{
		System.out.print(s.charAt(i));
          }
        }
		// 出力
	}
}