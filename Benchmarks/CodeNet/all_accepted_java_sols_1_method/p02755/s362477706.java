import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int price = 10*b;
	    boolean flag = false;
	    for(int i = 0; i < 10; i++) {
	    	if((int)((price+i)*0.08) == a) {
	    		System.out.println(price+i);
	    		flag = true;
	    		break;
	    	}
	    }
	    if(flag == false) {
	    	System.out.println(-1);
	    }

	}

}