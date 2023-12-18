import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int x =a;
        int y =0;
        
        	while(x<=b){
        		if(c % x ==0){
        			y++;
        		}
        		x++;
        	}
        System.out.println(y);
	}
}