import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int P = sc.nextInt();
      	int Q = sc.nextInt();
        int R = sc.nextInt();
        
        int tmp[] = {P+Q, Q+R, R+P};
        Arrays.sort(tmp);
        System.out.println(tmp[0]);
    }
}