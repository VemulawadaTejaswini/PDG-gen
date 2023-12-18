
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n = sc.nextInt();
				if(n==0)break;
				String str1 = "", str2 = "";
				int[] s1 = new int[10010];
				int[] s2 = new int[10010];
				int cnt;
				for(int i=0;i<n;i++) {
					str1 = sc.next();
					str2 = sc.next();
					
					s1[i] = ((str1.charAt(0)-'0')*10+(str1.charAt(1)-'0'))*3600; //発車時刻[s]
					s1[i] += ((str1.charAt(3)-'0')*10+(str1.charAt(4)-'0'))*60;
					s1[i] += ((str1.charAt(6)-'0')*10+(str1.charAt(7)-'0'));
					
					s2[i] = ((str2.charAt(0)-'0')*10+(str2.charAt(1)-'0'))*3600; //出発時刻[s]
					s2[i] += ((str2.charAt(3)-'0')*10+(str2.charAt(4)-'0'))*60;
					s2[i] += ((str2.charAt(6)-'0')*10+(str2.charAt(7)-'0'));
				}
					
				int max = 0;
				for(int i=0;i<=86400;i++) {									//1日86400秒
					cnt = 0;
					for(int j=0;j<n;j++) {
						if(s1[j] <= i && i < s2[j]) cnt++;
					}
					max = Math.max(max,cnt);
				}
				System.out.println(max);
			}
		}
	}
}


