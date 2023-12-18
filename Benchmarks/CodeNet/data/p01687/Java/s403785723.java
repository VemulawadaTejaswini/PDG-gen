import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = s.length();
		int[] a = new int[26];
		
		if(n>=8){
			int id = 0;
			boolean flag = true;
			while(true){
				if(flag){
					for(int i=0;i<26;i++) a[i] = 0;
					for(int i=0;i<8;i++) a[s.codePointAt(id+i)-65]++;
					flag = false;
				}
				if(a[0]==2 && a[3]==1 && a[8]==1 && a[13]==2 && a[20]==1 && a[24]==1){
					s = s.substring(0, id) + "AIZUNYAN" + s.substring(id+8, n);
					flag = true;
					id += 8;
				}
				if(id>=n-8) break;
				if(!flag){
					a[s.codePointAt(id)-65]--;
					a[s.codePointAt(id+8)-65]++;
					id++;
				}
			}
		}
		System.out.println(s);
	}
}