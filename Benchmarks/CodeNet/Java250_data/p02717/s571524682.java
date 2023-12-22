import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int a = sc.nextInt();
	// スペース区切りの整数の入力
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int tmp = a;
	a = b;
	b = tmp;
	
	tmp = a;
	a = c;
	c = tmp;
	
	// 出力
	System.out.print(a);
	System.out.print(" ");
	System.out.print(b);
	System.out.print(" ");
	System.out.print(c);
	}
}