import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int chairLen = sc.nextInt();
		int humanLen = sc.nextInt();
		int width = sc.nextInt();
		
		int firstLen = width;
		int len = humanLen + width;
		int cnt = 0;
		while (firstLen + cnt * len <= chairLen) {
			cnt++;
		}
		System.out.println(cnt-1);
		return;
	}
}


