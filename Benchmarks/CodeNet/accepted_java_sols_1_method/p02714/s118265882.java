import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String s = scn.next();
      	int r = 0;
      	int g = 0;
      	int b = 0;
      	for(int i=0; i<n; i++){
			if(s.charAt(i)=='R'){
				r++;
			}else if(s.charAt(i)=='G'){
				g++;
			}else{
				b++;
			}
		}
      	long ans = (long)r*g*b;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				int k = 2*j - i;
				if(k>=n){
					continue;
				}
				char ci = s.charAt(i);
              	char cj = s.charAt(j);
              	char ck = s.charAt(k);
				if(ci != cj && cj != ck && ck != ci){
					ans--;
				}
			}
		}
		System.out.println(ans);
	}
}
