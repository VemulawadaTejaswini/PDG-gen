import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// A
		int apple = sc.nextInt();
		// P
		int apple_tri = sc.nextInt();
      	//下拵え
      	apple_tri += apple*3;        
        //調理
      	int apple_pie = apple_tri/2;
		// 出力
		System.out.println(apple_pie);
	}
}

