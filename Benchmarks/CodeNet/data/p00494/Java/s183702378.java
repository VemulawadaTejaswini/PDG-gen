import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		String joi=sc.next();
		int n=joi.length();
		int num[]=new int[n];
		char str[]=new char[n];
		str[0]=joi.charAt(0);
		int cnt=0;
		for(int i=1;i<n;i++){
			char tmp=joi.charAt(i);
			if(tmp==joi.charAt(i-1)){
				num[cnt]++;
			}else{
				cnt++;
				str[cnt]=tmp;
			}
		}
		int ans=0;
		//for(int i=0;i<=cnt;i++)System.out.println(str[i]+" "+num[i]);
		for(int i=0;i<n-2;i++){
			//System.out.println(str[i]+" "+num[i]+" "+str[i+1]+" "+num[i+1]+" "+str[i+2]+" "+num[i+2]);
			if(str[i]=='J'&&str[i+1]=='O'&&str[i+2]=='I')
				if(num[i]>=num[i+1]&&num[i+2]>=num[i+1])
					ans = Math.max(ans, (num[i+1]+1));					
		}
		System.out.println(ans);
	}
}