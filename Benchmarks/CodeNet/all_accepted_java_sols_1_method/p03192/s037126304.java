import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	String s = sc.next();

	int ans = 0;
	for ( int i = 0; i <= 3; i++ ){
	    if (s.substring(i, i+1).equals("2")){
		ans++;
	    }
	}

	System.out.println(ans);
    }
}


