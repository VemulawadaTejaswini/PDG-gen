import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int n = s.length();
		int m = t.length();
		String[] subs = new String[n-m+1];
		Arrays.fill(subs, "|");
		String ans = "";
		if(n>=m){
			boolean bl = false;
			for(int i=0; i<=n-m; i++){
				bl = false;
				for(int j=0; j<=m-1; j++){
					if(s.charAt(i+j)!=t.charAt(j) && s.charAt(i+j)!='?'){
						bl = true;
						break;
					}
				}
				if(bl==false){
					subs[i] = s.substring(0, i) + t + s.substring(i+m);
					subs[i] = subs[i].replaceAll("\\?", "a");
				}
			}
			Arrays.sort(subs);
			ans = subs[0];
          	if(ans.equals("|"))ans = "UNRESTORABLE";
		}
		else ans = "UNRESTORABLE";
		System.out.println(ans);
	}
}