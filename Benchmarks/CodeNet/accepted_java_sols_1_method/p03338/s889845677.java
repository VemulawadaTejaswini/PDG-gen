import java.util.*;
public class Main { 
	public static void main(String arts[]) { 
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		String s =sc.next();
		int ans = 0;
		for(int i = 1; i < n; i++){
			int count = 0;
			for(char c = 'a' ; c <= 'z'; c++){
				//全部の文字見つけてやるよ
				int finds1 = 0;
				int finds2 = 0;
				//string1
				for(int j = 0 ; j < i ; j ++){
					if(s.charAt(j) == c){
						finds1=1;
						break;
					}
				}
				for(int j = i ; j < n; j++){
					if(s.charAt(j) ==c){
						finds2 = 1;
						break;
					}
				}
				if(finds1==1&&finds2==1){
					count ++;
				}
			}
			if(count > ans){
				ans = count;
			}
		}
		System.out.println(ans);
	} 
} 


