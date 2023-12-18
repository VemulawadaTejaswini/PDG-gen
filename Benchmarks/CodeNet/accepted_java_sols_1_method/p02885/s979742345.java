import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int yoko = sc.nextInt();
		int katen = sc.nextInt();
		if(!(0 > yoko-katen*2)){
      System.out.printf("%d",yoko-katen*2);
    }else{
      System.out.println("0");
    }
	}
}