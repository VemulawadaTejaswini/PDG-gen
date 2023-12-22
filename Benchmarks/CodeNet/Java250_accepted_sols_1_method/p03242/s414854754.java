import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		StringBuffer sb = new StringBuffer();
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)=='1')
				sb.append('9');
			else if(s.charAt(i)=='9')
				sb.append('1');
			else
				sb.append(s.charAt(i));
		}
		System.out.println(sb);
	}
}