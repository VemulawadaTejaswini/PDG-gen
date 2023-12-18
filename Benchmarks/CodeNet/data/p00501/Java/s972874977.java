import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int count = 0;
		int flag;
		for(int i=0;i<n;i++){
			String t = sc.next();
			for(int p=0;p<t.length();p++){
				for(int q=1;;q++){
					if(p+q*(s.length()-1)>=t.length()){
						break;
					}
					flag = 1;
					for(int r=0;r<s.length();r++){
						if(s.charAt(r)!=t.charAt(p+q*r)){
							flag = 0;
							break;
						}
					}
		  			if(flag==1){
					    count++;
					    p = t.length();
					    break;
					}
				}
			}
		}
		System.out.println(count);
	}	
}