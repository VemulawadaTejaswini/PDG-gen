import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();sc.nextLine();
		String str[]=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
		}
		int m=sc.nextInt();sc.nextLine();
		String str2[]=new String[m];
		for(int i=0;i<m;i++) {
			str2[i]=sc.nextLine();
		}
		int count[] = new int[n];
		for(int i=0;i<n;i++) {
			int tmp=0;
			for(int k=0;k<n;k++) {
				if(str[i].equals(str[k])) {
					tmp++;
				}
			}
			for(int k=0;k<m;k++) {
				if(str[i].equals(str2[k])) {
					tmp--;
				}
			}
			count[i]=tmp;
		}
		int goal=0;
		for(int i=0;i<n;i++) {
			goal=Math.max(goal, count[i]);
		}
		System.out.println(goal);
	}
}