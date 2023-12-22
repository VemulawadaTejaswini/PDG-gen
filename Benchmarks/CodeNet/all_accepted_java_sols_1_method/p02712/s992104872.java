import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long sum = 0;
	    for(int i = 1; i <= num; i++){
	    	if(i % 3 != 0 && i % 5 != 0){
	    		sum += i;
	    	}
	    }
	    System.out.println(sum);
	}
}
