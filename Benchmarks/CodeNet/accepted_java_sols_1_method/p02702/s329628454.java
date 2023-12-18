import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] s=sc.nextLine().toCharArray();
		long[] m=new long[s.length+1];
		long[] l= new long[s.length+1];
		m[0]=0;
      	l[0]=1;
		for(int i=0;i<s.length;i++){
			l[i+1]=(l[i]*10)%2019;
			m[i+1]=(m[i]+((int)s[s.length-i-1]-(int)'0')*l[i])%2019;
          	//System.out.println(m[i+1]);
		}
		long[] ms=new long[2019];
		for(int i=0;i<m.length;i++){
			ms[(int)m[i]]++;
		}
		long ans=0;
		for(int i=0;i<ms.length;i++){
			ans+=ms[i]*(ms[i]-1)/2;
          	//System.out.println(ms[i]);
		}
		System.out.println(ans);
	}
}
