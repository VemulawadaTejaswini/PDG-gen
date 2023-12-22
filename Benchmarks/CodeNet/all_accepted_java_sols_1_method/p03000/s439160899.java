import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x = sc.nextInt();
		long len[] = new long[num];
		for(int i = 0; i < num; i ++) {
			len[i] = sc.nextLong();
		}
		long tmp = 0;
		int count = 1;
		for(int i = 0; i < num; i ++) {
			tmp += len[i];
			if(tmp > x) { break; }
			count ++;
		}
		System.out.println(count);
	}
}