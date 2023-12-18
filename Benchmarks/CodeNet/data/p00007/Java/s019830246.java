import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	double rate = 0.05 * (sc.nextInt());

	double money = 100000 + (100000*rate);
	//System.out.println(rate+" "+(100000*rate));
	if(money%10000!=0){
	    money = money + (10000 - (money%10000));
	}

	System.out.println((int)money);
    }
}