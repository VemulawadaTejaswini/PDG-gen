import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		char[] rl = str.toCharArray();
		int[] count_r = new int[len], count_l=new int[len], count = new int[len];
		int num=0;
		for(int i=len-1;i>=0;i--) {
			if(rl[i]=='L') num=0;
			else {
				num++;
				count_r[i]=num;
			}
		}
		for(int i=0;i<len;i++) {
			if(rl[i]=='R') num=0;
			else {
				num++;
				count_l[i]=num;
			}
		}
		for(int i=0;i<len;i++) {
			if(count_r[i]!=0) {
				if(count_r[i]%2==0) count[i+count_r[i]]++;
				else count[i+count_r[i]-1]++;
			}else {
				if(count_l[i]%2==0) count[i-count_l[i]]++;
				else count[i-count_l[i]+1]++;
			}
		}
		for(int i=0;i<len;i++) System.out.print(count[i]+" ");
		System.out.println();
	}
}