import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		String c[] = s.split("");


		// 計算
		int happy = 0;
		int lr = 0;
		int rl = 0;
		for(int i = 0; i < n; i++){
		    /*
		    if(i == 0 && c[i].equals("L")){
		        rl++;
		    }
		    if(i == n - 1 && c[i].equals("R")){
		        rl++;
		    }*/
		    
		    if(i > 0){
		        if(c[i - 1].equals(c[i])){
		            happy++;
		        }else{
		            if(c[i].equals("R")){
		                lr++;
		            }else{
		                rl++;
		            }
		        }
		    }
		}
		int result = happy + min(min(lr, rl), k)*2;
		if(abs(lr - rl) > 0 && k - min(lr, rl) > 0) result++;

		// 出力
		System.out.println(result);
	}
}
