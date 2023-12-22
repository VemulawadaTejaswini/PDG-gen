import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long X = sc.nextLong();
        long money=100;
      	int s=0;
        
        
        while(money<X){
        	money+=money/100;
        	s++;
        }
		System.out.println(s);
		
	}
}