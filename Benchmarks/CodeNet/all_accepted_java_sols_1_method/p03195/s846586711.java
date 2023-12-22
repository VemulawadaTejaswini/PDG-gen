import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	// 整数の入力
	long n = sc.nextLong();

	String ans = "second";

	for(int i = 1; i <= n; i++){
	    long a = sc.nextLong();
	    if (a % 2 == 1){
		ans = "first";
	    }
	}

	System.out.println(ans);
    }
}



