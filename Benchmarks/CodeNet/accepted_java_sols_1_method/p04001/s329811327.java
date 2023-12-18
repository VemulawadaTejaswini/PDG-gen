import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			char[] s = sc.next().toCharArray();
			int n = s.length -1;
			long ans=0;
			for(int bits = 0; bits < (1 << n); bits++) {
				long num = 0;
				long a=s[0]-'0';
				for(int i = 0; i < n; i++) {
					if((bits & (1<<i)) != 0) {
						num+=a;
						a=0;
					}
					a=a*10+s[i+1]-'0';
				}
				num+=a;
				ans+=num;
			}
			System.out.println(ans);
		}
	}
}