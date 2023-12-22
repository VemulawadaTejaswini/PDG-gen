import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long price = sc.nextLong();
        long happy = 0;
        
        happy += price / 500 * 1000;
        price = price % 500;
        happy += price / 5 * 5;
        System.out.println(happy);
    }
}