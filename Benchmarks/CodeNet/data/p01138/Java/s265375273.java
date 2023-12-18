import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				String str1="", str2="";
				int[] s1=new int[10010];
				int[] s2=new int[10010];
				int count;
				for(int i=0; i<n; i++) {
					str1=sc.next();
					str2=sc.next();
					s1[i]=((str1.charAt(0)-'0')*10+(str1.charAt(1)-'0'))*3600;
					s1[i]+=((str1.charAt(3)-'0')*10+(str1.charAt(4)-'0'))*60;
					s1[i]+=((str1.charAt(6)-'0')*10+(str1.charAt(7)-'0'));
					s2[i]=((str2.charAt(0)-'0')*10+(str2.charAt(1)-'0'))*3600;
					s2[i]+=((str2.charAt(3)-'0')*10+(str2.charAt(4)-'0'))*60;
					s2[i]+=((str2.charAt(6)-'0')*10+(str2.charAt(7)-'0'));
				}//s1発車時刻[秒] s2到着時刻[秒]
				int max=0;
				for(int i=0; i<=s2[n-1]; i++) {
					count=0;
					for(int j=0; j<n; j++) {
						if(s1[j]<=i && i<s2[j]) {
							count++;
						}
					}
					max=Math.max(max, count);
				}
				System.out.println(max);
			}
		}
	}
}
