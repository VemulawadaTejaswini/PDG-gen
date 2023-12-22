import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in).useDelimiter("");
		int s[] = new int[3];
		s[0] = scan.nextInt();
		s[1] = scan.nextInt();
		s[2] = scan.nextInt();
		int ans = 0;
		for (int i = 0 ; i < 3 ; i ++ ){
		if(s[i]==1){ans++;} ;}
		// 出力
		System.out.println(ans);
	}
}