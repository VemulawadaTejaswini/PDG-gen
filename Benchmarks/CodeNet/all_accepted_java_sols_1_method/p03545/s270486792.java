import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] s1=new char[s.length()+1];
		for(int i=0; i<s.length(); i++){
			s1[i]=s.charAt(i);
		}
		for(int i = 0; i<Math.pow(2,s.length()-1); i++){
			long ans = Long.parseLong(String.valueOf(s1[0]));
			StringBuilder sb=new StringBuilder();
			sb.append(s);
			int t=i;
			int count=1;
			String a=String.valueOf(s1[1]);
			while(count<s.length()){
				if((t & 1)==1){
					ans+=Long.parseLong(a);
					
						sb.insert(count*2-1,"+");
					
				}else{
					ans-=Long.parseLong(a);
					
						sb.insert(count*2-1,"-");
					
				}
				count++;
				a=String.valueOf(s1[count]);
				t>>=1;
			}
			if(ans==7){
				sb.append("=7");
				System.out.println(sb);
				return;
			}
		}
	}
}