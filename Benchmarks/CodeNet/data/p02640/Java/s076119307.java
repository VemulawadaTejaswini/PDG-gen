import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		boolean ans=false;
      if(b%2!=0){
        System.out.println("No");
                 }else{
      for(int i=0; i<=a; i++){
      if((2*i)+(4*(a-i))==b){
        ans=true;
        break;
      }
      }
      if(ans){
      System.out.println("Yes");
      }else{
      System.out.println("No");
      }}
	}
}