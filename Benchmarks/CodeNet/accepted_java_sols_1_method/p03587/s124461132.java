import java.util.Scanner;
public class Main {
	public static void main(String args[]){
	    int cnt=0;
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char[] charArray = str.toCharArray();
		
		for (char ch : charArray) {
		    if(ch=='1')
	            cnt++;
        }

		System.out.println(cnt);
		
	}
}