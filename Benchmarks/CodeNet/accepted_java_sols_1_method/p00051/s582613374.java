import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n ;i++){
			char [] temp = sc.next().toCharArray();
			int num[] = new int[temp.length];
			for(int j = 0; j < temp.length; j++){
				num[j] = temp[j] -'0';
			}
			Arrays.sort(num);
			String ans = "";
			for(int j:num){
				ans += String.valueOf(j);
			}
			StringBuilder sb = new StringBuilder(ans);
			System.out.println(Integer.parseInt(sb.reverse().toString())-Integer.parseInt(ans));
		}
	}
}