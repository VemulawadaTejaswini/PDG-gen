import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	String a = sc.next();
	String a1 = a.substring(0, 1);
	String a2 = a.substring(1, 2);
	String a3 = a.substring(2, 3);

    	
	// 出力
	if(a1.equals("7") || a2.equals("7") || a3.equals("7"))
	{
    	System.out.print("Yes");
	} else {
    	System.out.print("No");
	}
	}
}
