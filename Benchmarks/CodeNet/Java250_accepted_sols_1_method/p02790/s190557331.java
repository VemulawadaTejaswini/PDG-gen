import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
      if(b<c){
        for(int i=0;i<c;i++){
		System.out.print(""+b);
      }
        System.out.println("");
      }else{
        for(int i=0;i<b;i++){
		System.out.print(""+c);
      }
        System.out.println("");
      }
	}
}