import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = 0;
		int[] a = new int[200000];
		int[] z = new int[200000];
		int k = 0;
		int j = 0;
		for(int i = 0;i < s.length();i++) {
			char c = s.charAt(i);
			if(c == 'A') {
				a[k] = i;
				k++;
			}else if(c == 'Z') {
				z[j] = i;
				j++;
			}
		}
		len = z[j-1] - a[0] + 1;
		System.out.println(len);
	}
}
