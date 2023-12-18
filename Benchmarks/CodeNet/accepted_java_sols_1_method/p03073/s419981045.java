import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char []s = sc.next().toCharArray();
		int p = s.length;
		int []t = new int [p];
		
		for(int i = 0; i< p;i++) {
			if(s[i] == '0') {
				t[i] = 0;
			}
			if(s[i] == '1') {
				t[i] = 1;
			}
		}
		int count = 0;
		for(int i = 0 ; i < p-1 ; i++) {
			if(t[i] + t[i+1] == 0) {
				t[i+1] = 1;
				count++;
			}
			if(t[i] + t[i+1] == 2) {
				t[i+1] = 0;
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
