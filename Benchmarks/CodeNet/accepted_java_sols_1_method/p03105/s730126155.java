import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int price, money, times;
      	price = Integer.parseInt(sc.next());
      	money = Integer.parseInt(sc.next());
      	times = Integer.parseInt(sc.next());
      	if(price * times <= money) System.out.println(times);
      	else System.out.println(money / price);
    }
}