import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int n = s.length();
		int[] sn = new int[n];
		int[] tn = new int[n];
		int cnt = 1;
		sn[0] = 0;
		tn[0] = 0;
		for(int i=1; i<n; i++){
			for(int j=1; j<i; j++){
				if(s.charAt(i)==s.charAt(j)){
					sn[i] = sn[j];
					break;
				}
				else sn[i] = cnt++;
			}
		}
		cnt = 1;
		for(int i=1; i<n; i++){
			for(int j=1; j<i; j++){
				if(t.charAt(i)==t.charAt(j)){
					tn[i] = tn[j];
					break;
				}
				else tn[i] = cnt++;
			}
		}
		boolean bl = false;
		for(int i=0; i<n; i++){
			if(sn[i]!=tn[i]){
				bl = true;
				break;
			}
		}
		System.out.println(bl==false ? "Yes" : "No");
	}
}