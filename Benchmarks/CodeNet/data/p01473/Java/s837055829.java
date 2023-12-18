
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long ans = 1;
		int count[] = new int[26];
		int odd = 0;
		for(int i=0;i<s.length();i++){
			count[s.charAt(i)-'a']++;
			if(count[s.charAt(i)-'a']%2 == 1){
				odd++;
			}else{
				odd--;
			}
		}
		if(odd >= 2){
			System.out.println("0");
			return;
		}else{
			if(s.length() != 40){
				ans = fact((s.length()-odd)/2);
				for(int i=0;i<count.length;i++){
					if(count[i]%2 == 0){
						ans /= fact(count[i]/2);
					}
				}
			}else{
				double ansp = fact(19);

				for(int i=0;i<count.length;i++){
					if(count[i]%2 == 0){
						ansp /= fact(count[i]/2);
					}
				}
				
				ans = (long)ansp*20;
			}
		}
		System.out.println(ans);
	}
	
	static long fact(int n){
		if(n == 0)
			return 1;
		else
			return n * fact(n-1);
	}
}