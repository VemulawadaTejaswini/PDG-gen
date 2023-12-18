import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int c=0, i, j, k, f, r;
		for(i=0;i<n;i++){
			String t = sc.next();
			for(j=0;j<t.length();j++){
				for(k=1;;k++){
					if(t.length() <= j+k*(s.length()-1)){
						break;
						}
					f = 1;
					for(r=0;r<s.length();r++){
						if(s.charAt(r)!=t.charAt(j+k*r)){
							f = 0;
							break;
							}
						}
					if(f==1){
						c = c + 1;
						j = t.length();
						break;
						}
					}
				}
			}
		System.out.println(c);
		}
	}