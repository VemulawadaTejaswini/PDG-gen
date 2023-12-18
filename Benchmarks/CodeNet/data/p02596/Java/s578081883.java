import java.util.*;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long k = sc.nextLong();
	if(k % 2 == 0){
		System.out.println("-1");
		System.exit(0);
	}
	if(k == 7 || k == 1){
		System.out.println("1");
		System.exit(0);
	}
	boolean finish = false;
	long count = 2;
	final long num = 7 % k;
	long amari = num;
	while(finish == false){
		if((amari * 10 + num) % k == 0) {
			finish = true;
		}
		else if(!((amari * 10 + num) % k == 0)){
			amari = (amari * 10 + num) % k;
			count++;
			System.out.println(count);
		}
	}
	System.out.println(count);
	sc.close();
	}
}