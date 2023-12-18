import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<String> ans = new ArrayDeque<String>();

		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			String s = sc.next();
			String t = sc.next();
			String u = "";
			int[] rst = new int[80];
			
			if(s.length()<t.length()){
				u = s;
				s = t;
				t = u;
			}
			
			int exit=0;
			int sub = s.length()-t.length();
			
			if(s.length()>80){
				exit=1;
			}else{
				for(int j=0;j<s.length();j++){
					int a = Integer.valueOf(s.substring(s.length()-1-j,s.length()-j));
					int b = 0;
					if(j<t.length()){
						b = Integer.valueOf(t.substring(t.length()-1-j,t.length()-j));
					} 
					int c = a+b+rst[j];
					if(j==79 && c>9){
						exit=1;
					}else{
						if(j!=79)rst[j+1] = c/10;
						rst[j] = c%10;
					}
				}
			}
			
			if(exit==1){
				ans.push("overflow");
			}else{
				String stn = "";
				for(int k=0;k<s.length();k++){
					stn += rst[k];
				}
				if(s.length()!=80 && rst[s.length()]!=0){
					stn += rst[s.length()];
				}
				StringBuffer sb = new StringBuffer(stn);
				ans.push(sb.reverse().toString());
			}
			
		}
		int num = ans.size();
		for(int i=0;i<num;i++){
			System.out.println(ans.pollLast());
		}
	}
}