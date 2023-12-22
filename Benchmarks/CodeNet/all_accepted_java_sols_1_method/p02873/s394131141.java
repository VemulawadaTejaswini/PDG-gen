import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		String s = sc.next(); 
        long l = 1;
        long r = 0;
        for(int i=1;i<s.length();i++){if(s.charAt(i-1)==s.charAt(i)){l++;}
                                      else{ans+=l*(l+1)/2-Math.min(l,r);if(s.charAt(i-1)=='<'){r=l;}
                                           else{r=0;}
                                           l=1;}
                                     }
         ans+=l*(l+1)/2-Math.min(l,r);       
		System.out.println(ans);
	}
}