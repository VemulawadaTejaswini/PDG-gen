import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int coin_num = sc.nextInt();
      	int target = sc.nextInt();
      	final int fivehund = 500;
      	if(coin_num * fivehund >= target)
        	System.out.println("Yes");
      	else
          	System.out.println("No");
    }
}