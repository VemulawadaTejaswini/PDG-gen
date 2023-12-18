import java.util.*;
public class Main {
	public static void main(String[] args){
		//データ取り込み
		Scanner sc = new Scanner(System.in);
		//String S = sc.next();
		//int N = sc.nextInt();
		//System.out.println();
		String S = sc.next();
		int cnt = 0;
		
		for(char a : S.toCharArray()){
			if(a == '1'){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}