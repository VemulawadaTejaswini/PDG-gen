import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String N = sc.next();
		
		if(N.equals("Sunny")) {
			System.out.println("Cloudy");
		}
		if(N.equals("Cloudy")) {
			System.out.println("Rainy");
		}
		if(N.equals("Rainy")) {
			System.out.println("Sunny");
		}

   		sc.close();
        return ;

    }
    
}
