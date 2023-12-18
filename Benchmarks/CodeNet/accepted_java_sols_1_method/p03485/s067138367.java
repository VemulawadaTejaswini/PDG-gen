import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

		int x = a + b;
        if(x%2 == 1){
            System.out.println((x+1)/2);
        } else{
            System.out.println(x/2);
        }
	}
}
