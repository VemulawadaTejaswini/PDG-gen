import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// 入力
    	String s = sc.next();
    	String[] ary = s.split("", 0);
    	StringBuilder ans = new StringBuilder();

    	for(int i = 0; i < ary.length; i++){
    		if (i % 2 == 1){
    			continue;
    		}
    		ans.append(ary[i]);
    	}
    	// 出力
    	System.out.println(ans);
    }
}