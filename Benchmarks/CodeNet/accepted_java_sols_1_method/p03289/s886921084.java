import java.util.*;

public class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String ans[] = {"AC", "WA"};
		int an = 0;
		int n = s.length();
		int count = 0;
		if(s.charAt(0) != 'A')an = 1;
		for(int i = 1; i < n; ++i){
			if(Character.isUpperCase(s.charAt(i))){
				if(i == 1 || i == n - 1){
					an = 1;
					break;
				}
				else{
					if(s.charAt(i) == 'C'){
						if(count >= 1){
							an = 1;
							break;
						}
						count++;
					}
				}	
			}
		}
		if(count == 0)an = 1;
		System.out.println(ans[an]);
	}
}